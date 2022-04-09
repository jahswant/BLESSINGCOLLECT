B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=11
@EndOfDesignText@
Sub Class_Globals
	Dim B4XPageHasResized As Boolean = False
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	#If B4A
	Private ToolbarHelper As ACActionBar
	Dim Ac As AppCompat
	Private ACToolBarLight1 As ACToolBarLight
	#End If
	Private Toast As BCToast
	Private PnlContent As Panel
	Private CustomListViewOrders As CustomListView
	Private ImageViewProfile As B4XImageView
	Private imgLogout As B4XImageView
	Private imgProfile As B4XImageView
	Private lblFullNames As Label
	Private lblStatus As Label
	Private MenuSignUser As Panel
	Private ImageViewProfilePNL As Panel
	Private imgLogoutPNL As Panel
	Private rp As RuntimePermissions
	Private BottomWobbleMenu As WobbleMenu
	Private MapFragmentAddress As MapFragment
	Private gmap As GoogleMap
	Dim MapReady As Boolean
	Private BasePanel As Panel
	Private lblAfternoon As Label
	Private lblAfternoonCollect As Label
	Private lblDayName As Label
	Private lblMorning As Label
	Private lblMorningCollect As Label
	Private PanelLine As Panel
	Private imgLogoS As ImageView
	Dim cd As B4XDialog
	Dim Action() As String
	Private B4XImageViewLOGO As B4XImageView
	Private btnPay As Button
	Private imgCancelMe As Label
	Private lblHeaderText As Label
	Private Panel2 As Panel
	Private PanelBack As Panel
	Private pnlCancel As Panel
	Private txtMOMOTelephone As MetroUI_TextView
	Dim IME As IME
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Toast.Initialize(Root)
	Toast.DefaultTextColor = Colors.White
	Toast.pnl.Color = B4XPages.MainPage.HexToColor("#FF222D32")
	Root.LoadLayout("action_bar")
	
	ACToolBarLight1.SetAsActionBar
	ACToolBarLight1.InitMenuListener
	
	Ac.SetElevation(ACToolBarLight1, 0dip)
'	
	ToolbarHelper.Initialize ' ABHelper was dimmed as ACActionBar
	ToolbarHelper.ShowUpIndicator = False ' Need to set to True
	
	ACToolBarLight1.Title = "BLESSING COLLECT"
	ACToolBarLight1.SubTitle = "WELCOME"
	
	PnlContent.LoadLayout("userdash")
	cd.Initialize(PnlContent)
	
	IME.Initialize("IME")
	
	BottomWobbleMenu.SetTabTextIcon(1,"HOME",Chr(0xF015),Typeface.FONTAWESOME)
	BottomWobbleMenu.SetTabTextIcon(2,"ADD MONEY",Chr(0xF0ED),Typeface.FONTAWESOME)
	BottomWobbleMenu.SetTabTextIcon(3,"SEND MONEY",Chr(0xF0EE),Typeface.FONTAWESOME)
	BottomWobbleMenu.SetTabTextIcon(4,"NEAR BY",Chr(0xF041),Typeface.FONTAWESOME)
	BottomWobbleMenu.SetTabTextIcon(5,"ABOUT US",Chr(0xF05A),Typeface.FONTAWESOME)
	
	BottomWobbleMenu.SetCurrentTab(1)

	imgProfile.Bitmap = LoadBitmap(File.DirAssets,"1.jpg")
	ImageViewProfile.Bitmap = LoadBitmap(File.DirAssets,"forget_pass.png")
	imgLogout.Bitmap = LoadBitmap(File.DirAssets,"logout.png")
	
	Action = Array As String ("DEBIT","CREDIT")
	
	For i = 0 To 30 
		If  i Mod 2  = 0 Then
			CustomListViewOrders.Add(CreateItem3(CustomListViewOrders.AsView.Width,Action(0) ,Rnd(1000,5000)&"0XAF",DateTime.Date(DateTime.Now)),i)
		Else
			CustomListViewOrders.Add(CreateItem3(CustomListViewOrders.AsView.Width,Action(1) ,  Rnd(1000,5000)&"0XAF",DateTime.Date(DateTime.Now)),i)
		End If
		
	Next

End Sub


Private Sub pnlCancel_Click
	cd.Close(0)
End Sub

Public Sub ShowDialog
	cd.BlurBackground = False
	cd.BackgroundColor = xui.Color_Transparent
	cd.BorderCornersRadius =0
	cd.BorderColor = B4XPages.MainPage.HexToColor("#FFFE3D3D")
	cd.PutAtTop = True
	cd.BorderWidth = 0
	Dim DialogPNL As B4XView = xui.CreatePanel("DialogPNL")
	DialogPNL.SetLayoutAnimated(1, 0, 0, Root.Width-10dip, Root.Height/2)
	DialogPNL.LoadLayout("paynow")
	lblHeaderText.Text = "USE MTN MOMO"
	txtMOMOTelephone.Hint = "PHONE NUMBER"
	btnPay.Text = "PAY NOW"
	B4XImageViewLOGO.Load(File.DirAssets,"mtnmomo.png")
	cd.ShowCustom(DialogPNL,"", "" ,"")
End Sub


Sub GetMOMOOperator(PhoneNumber As String) As String
	Dim Operator As String = ""
	If PhoneNumber.StartsWith("650") Or PhoneNumber.StartsWith("651") Or PhoneNumber.StartsWith("652") Or PhoneNumber.StartsWith("653") Or PhoneNumber.StartsWith("654") Or PhoneNumber.StartsWith("670") Or PhoneNumber.StartsWith("671") Or PhoneNumber.StartsWith("672") Or PhoneNumber.StartsWith("673") Or PhoneNumber.StartsWith("674") Or PhoneNumber.StartsWith("675") Or PhoneNumber.StartsWith("676") Or PhoneNumber.StartsWith("677") Or PhoneNumber.StartsWith("678") Or PhoneNumber.StartsWith("679") Or PhoneNumber.StartsWith("680") Then
		Operator = "MTN"
	Else If  PhoneNumber.StartsWith("655") Or PhoneNumber.StartsWith("656") Or PhoneNumber.StartsWith("657") Or PhoneNumber.StartsWith("658") Or PhoneNumber.StartsWith("659") Or PhoneNumber.StartsWith("69") Then
		Operator = "ORANGE"
	Else If  PhoneNumber.StartsWith("66") Then
		Operator = "NEXTTEL"
	Else If  PhoneNumber.StartsWith("222") Or PhoneNumber.StartsWith("233") Or PhoneNumber.StartsWith("242") Or PhoneNumber.StartsWith("243") Then
		Operator = "CAMTEL"
	End If
	Return Operator
End Sub



Private Sub btnPay_Click
	If (txtMOMOTelephone.Text.Trim.Length > 9 Or txtMOMOTelephone.Text.Trim.Length < 9) Or (IsNumber(txtMOMOTelephone.Text.Trim) = False) Then
		Toast.Show("ENTER VALID MOMO PHONE")
	Else If (txtMOMOTelephone.Text.Trim.Length = 9) And (IsNumber(txtMOMOTelephone.Text.Trim))  Then
		If GetMOMOOperator(txtMOMOTelephone.Text.Trim) <> "MTN" Then
			Toast.Show("ENTER VALID MOMO PHONE")
		Else If GetMOMOOperator(txtMOMOTelephone.Text.Trim) = "MTN" Then
			pnlCancel_Click
			#If B4A
			ProgressDialogShow2("SENDING PAYMENT REQUEST",True)
			IME.HideKeyboard
			#Else If B4I
			Main.mHud.ProgressDialogShow(B4XPages.MainPage.Loc.Localize("say_pay_status_failed"))
			#End If
			Dim DOWNDATA As API_PAY
			DOWNDATA.Initialize
			DOWNDATA.ORDER_ID = "10"
			DOWNDATA.PHONE_MOMO = txtMOMOTelephone.Text.Trim
			Dim Ser As B4XSerializator
			Dim UExKey() As Byte = UTILS.EncryptText((Ser.ConvertObjectToBytes(DOWNDATA)),B4XPages.MainPage.HTTP_ReqPass)
			Dim jobVerif As HttpJob
			jobVerif.Initialize("", Me)
			jobVerif.PostBytes(B4XPages.MainPage.ServerAddress & "/requestpay",UExKey)
			jobVerif.GetRequest.Timeout=60000
			Wait For (jobVerif) JobDone(Job As HttpJob)
			If Job.Success Then
				Log(Job.GetString)
				Toast.Show("PAYMENT REQUEST SENT")
			Else if Not(Job.Success ) Then
				Toast.Show("ERROR OCCURED")
			End If
			jobVerif.Release
			#If B4A
			ProgressDialogHide
			#Else If B4I
			Main.mHud.ProgressDialogHide
			#End If
		End If
	End If
End Sub


Sub B4XPage_Resize(Width As Int, Height As Int)
	B4XPageHasResized = True
End Sub

'Return True to close, False to cancel
Private Sub B4XPage_CloseRequest As ResumableSub
	Try
	#If B4A
		Dim sf As Object = xui.Msgbox2Async("DO YOU REALLY WANT TO QUIT ?", "BLESSING COLLECT", "YES", "", "NO", Null)
		Wait For (sf) Msgbox_Result (Result As Int)
		If Result = xui.DialogResponse_Positive Then
			ExitApplication
		End If
	#End If
	Catch
		Log(LastException)
	End Try
	Return False
End Sub

Private Sub B4XPage_Appear
	If B4XPageHasResized = True Then
	End If
	B4XPageHasResized = True
End Sub

Sub B4XPage_MenuClick(Menu As String)
	Try
		If Menu = "back" Then
			B4XPage_CloseRequest
		Else If Menu = "config" Then
			ShowDialog
		End If
	Catch
		Log(LastException)
	End Try
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

#If B4A
Sub ACToolBarLight1_NavigationItemClick
	B4XPage_CloseRequest
End Sub
#End If


Private Sub BottomWobbleMenu_Tab1Click
	Try
		If B4XPageHasResized Then
			For i = 0 To 30
				For i = 0 To 30
					If  i Mod 2  = 0 Then
						CustomListViewOrders.Add(CreateItem3(CustomListViewOrders.AsView.Width,Action(0) ,Rnd(1000,5000)&"0XAF",DateTime.Date(DateTime.Now)),i)
					Else
						CustomListViewOrders.Add(CreateItem3(CustomListViewOrders.AsView.Width,Action(1) ,  Rnd(1000,5000)&"0XAF",DateTime.Date(DateTime.Now)),i)
					End If
		
				Next
			Next
		End If
	Catch
		Log(LastException)
	End Try
End Sub



Private Sub BottomWobbleMenu_Tab3Click
	Try
		ShowDialog
	Catch
		Log(LastException)
	End Try
	
End Sub



'Private Sub BottomWobbleMenu_Tab4Click
'	B4XPageHasResized = True
'End Sub


Private Sub BottomWobbleMenu_Tab4Click
	Try
		B4XPageHasResized= True
		PnlContent.RemoveAllViews
		PnlContent.LoadLayout("nearbyplaces")
		Sleep(0)
		ACToolBarLight1.SubTitle = "NEAR BY STATIONS"
		Wait For (InitializeMap) Complete (Success As Boolean)
		MapReady = Success
		If MapReady Then
			gmap.Clear
			Dim cp As CameraPosition
			cp.Initialize("4.058907","9.702895", 20)
			gmap.MoveCamera(cp)
			gmap.AddMarker("4.058910","9.702800", "BLESSING STATION A")
			gmap.AddMarker("4.058950","9.702810", "BLESSING STATION B")
			gmap.AddMarker("4.058960","9.702895", "BLESSING STATION C")
			gmap.AddMarker("4.058980","9.702700", "BLESSING STATION B")
			gmap.AddMarker("4.05900","9.702880", "BLESSING STATION E")
			gmap.AddMarker("4.059000","9.702800", "BLESSING STATION F")
			gmap.AddMarker("4.09100","9.702810", "BLESSING STATION G")
			gmap.AddMarker("4.059200","9.702895", "BLESSING STATION H")
			gmap.AddMarker("4.059300","9.702700", "BLESSING STATION I")
			gmap.AddMarker("4.059400","9.702880", "BLESSING STATION E")
		End If
	Catch
		Log(LastException)
	End Try
End Sub


Private Sub BottomWobbleMenu_Tab5Click
	Try
	B4XPageHasResized = True
	PnlContent.RemoveAllViews
	PnlContent.LoadLayout("aboutlayout")
	imgLogoS.Bitmap = LoadBitmap(File.DirAssets,"blessing_logo_blanc.png")
	ACToolBarLight1.SubTitle = "ABOUT US"	
	Catch
		Log(LastException)
	End Try
End Sub



Private Sub InitializeMap As ResumableSub
   #If B4i
	gmap.Initialize("gmap", Main.API_KEY)
	pnlMap.AddView(gmap, 0, 0, pnlMap.Width, pnlMap.Height)
	gmap.GetUiSettings.CompassEnabled = True
	gmap.GetUiSettings.MyLocationButtonEnabled = True
	gmap.MyLocationEnabled = True
	Return True
	#Else if B4A
	Wait For gmap_Ready
	gmap = MapFragmentAddress.GetMap
	If gmap.IsInitialized Then
		rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCATION)
		Wait For B4XPage_PermissionResult (Permission As String, Result As Boolean)
		If Result Then
			gmap.MyLocationEnabled = True
		End If
	End If
	Return gmap.IsInitialized
	#End If
End Sub


Private Sub CreateItem3(Width As Int, Day As String, Time1 As String, Time2 As String) As Panel
	Dim p As B4XView = xui.CreatePanel("")
	Dim height As Int = 120dip
	If GetDeviceLayoutValues.ApproximateScreenSize < 4.5 Then height = 80dip
	p.SetLayoutAnimated(0, 0, 0, Width, height)
	p.LoadLayout("daysitem")
	lblDayName.Text = Day
	lblMorningCollect.Text = Time1
	lblAfternoonCollect.Text = Time2
	Return p
End Sub



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
	Private lblOrderAddress As Label
	Private lblOrderID As Label
	Private lblOrderPrice As Label
	Private lblOrderStaus As Label
	Private pnlDetails As Panel
	Private CustomListViewOrders As CustomListView
	Private B4XSwitchAvailable As B4XSwitch
	Private ImageViewProfile As B4XImageView
	Private imgLogout As B4XImageView
	Private imgProfile As B4XImageView
	Private lblAvailability As Label
	Private lblFullNames As Label
	Private lblStatus As Label
	Private MenuSignUser As Panel
	Private btnHistory As Button
	Private btnToday As Button
	Private ImageViewProfilePNL As Panel
	Private imgLogoutPNL As Panel
	Private lblOrderPayStaus As Label
	Private lblOrderPayStausTitle As Label
	Private PanelBA As Panel
	Private PanelSA As Panel
	Private ProgressBar1 As B4XView
	Private lblPullToRefresh As B4XView
	Private rp As RuntimePermissions
	Private BottomWobbleMenu As WobbleMenu
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
	ToolbarHelper.ShowUpIndicator = True ' Need to set to True
	
	ACToolBarLight1.Title = "HYSACAM COLLECT"
	ACToolBarLight1.Title = "WELCOME"
	
	PnlContent.LoadLayout("userdash")
	
	BottomWobbleMenu.SetTabTextIcon(1,"HOME",Chr(0xF015),Typeface.FONTAWESOME)
	BottomWobbleMenu.SetTabTextIcon(2,"NEAR BY",Chr(0xF041),Typeface.FONTAWESOME)
	BottomWobbleMenu.SetTabTextIcon(3,"NEWS",Chr(0xF1EA),Typeface.FONTAWESOME)
	BottomWobbleMenu.SetTabTextIcon(4,"SETTINGS",Chr(0xF013),Typeface.FONTAWESOME)
	BottomWobbleMenu.SetTabTextIcon(5,"ABOUT US",Chr(0xF05A),Typeface.FONTAWESOME)

	BottomWobbleMenu.SetBadge(4,5,Colors.White,Colors.Blue)

'	ImageViewProfile.Bitmap = LoadBitmap(File.DirAssets,"forget_pass.png")
'	imgLogout.Bitmap = LoadBitmap(File.DirAssets,"logout.png")
'	lblFullNames.Text = B4XPages.MainPage.GetBoyUserFullName
'	lblStatus.Text = B4XPages.MainPage.GetBoyUserPhone
	
End Sub

Sub B4XPage_Resize(Width As Int, Height As Int)
	B4XPageHasResized = True
End Sub

'Return True to close, False to cancel
Private Sub B4XPage_CloseRequest As ResumableSub
	Try
	#If B4A
		Dim sf As Object = xui.Msgbox2Async("DO YOU REALLY WANT TO QUIT ?", "HYSACAM COLLECT", "YES", "", "NO", Null)
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
	
End Sub

Private Sub BottomWobbleMenu_Tab2Click
	
End Sub

Private Sub BottomWobbleMenu_Tab3Click
	
End Sub

Private Sub BottomWobbleMenu_Tab4Click
	
End Sub

Private Sub BottomWobbleMenu_Tab5Click
	
End Sub
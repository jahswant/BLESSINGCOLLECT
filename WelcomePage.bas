B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=11
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("welcome")
	
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.


Private Sub btnFacebook_Click
	B4XPages.ShowPageAndRemovePreviousPages("USERMENU")
End Sub

Private Sub btnGoogle_Click
	B4XPages.ShowPageAndRemovePreviousPages("USERMENU")
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
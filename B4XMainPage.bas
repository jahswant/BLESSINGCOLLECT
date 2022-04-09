B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
'Start Emulator: ide://run?file=%LOCALAPPDATA%\Android\sdk\emulator\emulator.exe&Args=@Pixel_4_XL_API_31
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Public ServerAddress As String = "https://144.217.85.221:17179"
	Public HTTP_ReqPass As String = "J%uge7NBS6&Wc^vS7$?bSG^!@AjbcByR^Pb=ZY!jLZ$LGn87^8v2F2b7#22Pd-ME#gAsDKXn-%TZx-fmhdeuvH&ZH7zp*5Z_z&jsb7wpRrUYaccwaLUTM7!_hQB7VJtD"
	Dim Welcome As WelcomePage
	Dim UserMenu As UserMenuPage
	Public SQL As SQL
	Public Rs As ResultSet
	Public SQLDataBasePath As String
	Public SQLDateBaseName  As String
End Sub

Public Sub Initialize
'	B4XPages.GetManager.LogEvents = True
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("splash")

	SQLDataBasePath = xui.DefaultFolder
	SQLDateBaseName = "BLESSING_db.db"

	'check if the database already exists
	'File.Delete(SQLDataBasePath, SQLDateBaseName)
	If File.Exists(SQLDataBasePath, SQLDateBaseName) = False Then
		'copy the default DB
		File.Copy(File.DirAssets, SQLDateBaseName, SQLDataBasePath, SQLDateBaseName)
		'If Not, initialize it
		SQL.Initialize(SQLDataBasePath, SQLDateBaseName, True)
		'And create it
		'CreateDataBase
	Else If File.Exists(SQLDataBasePath, SQLDateBaseName) = True Then
		'If yes, initialize it
		SQL.Initialize(SQLDataBasePath, SQLDateBaseName, True)
	End If
	
	Welcome.Initialize
	UserMenu.Initialize
	
	B4XPages.AddPage("WELCOME",Welcome)
	B4XPages.AddPage("USERMENU",UserMenu)
	
	Sleep(2500)
	B4XPages.ShowPageAndRemovePreviousPages("WELCOME")
End Sub


'Return True to close, False to cancel
Private Sub B4XPage_CloseRequest As ResumableSub
	ExitApplication
	Return False
End Sub


Public Sub HexToColor(Hex As String) As Int
	Dim bc As ByteConverter
	If Hex.StartsWith("#") Then
		Hex = Hex.SubString(1)
	Else If Hex.StartsWith("0x") Then
		Hex = Hex.SubString(2)
	End If
	Dim ints() As Int = bc.IntsFromBytes(bc.HexToBytes(Hex))
	Return ints(0)
End Sub
'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

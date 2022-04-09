B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=11
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	#If B4A
	 Dim mCipher As B4XCipher
	 #Else If B4I
	 Dim mCipher As Cipher
	#End If
End Sub

Public Sub EncryptText(ClearData() As Byte, Password As String) As Byte()
	Return mCipher.Encrypt(ClearData, Password)
End Sub

Public Sub DecryptText(EncryptedData() As Byte, Password As String) As Byte()
	Dim b() As Byte = mCipher.Decrypt(EncryptedData, Password)
	Return b
End Sub
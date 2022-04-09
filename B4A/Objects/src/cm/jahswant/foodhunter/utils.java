package cm.jahswant.foodhunter;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class utils {
private static utils mostCurrent = new utils();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.object.B4XEncryption _v5 = null;
public b4a.example.dateutils _vvvvvv0 = null;
public cm.jahswant.foodhunter.main _vvvvvvv1 = null;
public cm.jahswant.foodhunter.starter _vvvvvvv3 = null;
public cm.jahswant.foodhunter.b4xpages _vvvvvvv4 = null;
public cm.jahswant.foodhunter.b4xcollections _vvvvvvv5 = null;
public cm.jahswant.foodhunter.httputils2service _vvvvvvv6 = null;
public cm.jahswant.foodhunter.xuiviewsutils _vvvvvvv7 = null;
public static byte[]  _v6(anywheresoftware.b4a.BA _ba,byte[] _encrypteddata,String _password) throws Exception{
byte[] _b = null;
 //BA.debugLineNum = 17;BA.debugLine="Public Sub DecryptText(EncryptedData() As Byte, Pa";
 //BA.debugLineNum = 18;BA.debugLine="Dim b() As Byte = mCipher.Decrypt(EncryptedData,";
_b = _v5.Decrypt(_encrypteddata,_password);
 //BA.debugLineNum = 19;BA.debugLine="Return b";
if (true) return _b;
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public static byte[]  _v7(anywheresoftware.b4a.BA _ba,byte[] _cleardata,String _password) throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Public Sub EncryptText(ClearData() As Byte, Passwo";
 //BA.debugLineNum = 14;BA.debugLine="Return mCipher.Encrypt(ClearData, Password)";
if (true) return _v5.Encrypt(_cleardata,_password);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Dim mCipher As B4XCipher";
_v5 = new anywheresoftware.b4a.object.B4XEncryption();
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
}

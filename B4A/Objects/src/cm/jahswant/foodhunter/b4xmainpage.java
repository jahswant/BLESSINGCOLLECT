package cm.jahswant.foodhunter;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "cm.jahswant.foodhunter.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", cm.jahswant.foodhunter.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvv7 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvv0 = null;
public String _vvvvvv1 = "";
public String _http_reqpass = "";
public cm.jahswant.foodhunter.welcomepage _vvvvvv2 = null;
public cm.jahswant.foodhunter.usermenupage _vvvvvv3 = null;
public anywheresoftware.b4a.sql.SQL _vvvvvv4 = null;
public anywheresoftware.b4a.sql.SQL.ResultSetWrapper _vvvvvv5 = null;
public String _vvvvvv6 = "";
public String _vvvvvv7 = "";
public b4a.example.dateutils _vvvvvv0 = null;
public cm.jahswant.foodhunter.main _vvvvvvv1 = null;
public cm.jahswant.foodhunter.utils _vvvvvvv2 = null;
public cm.jahswant.foodhunter.starter _vvvvvvv3 = null;
public cm.jahswant.foodhunter.b4xpages _vvvvvvv4 = null;
public cm.jahswant.foodhunter.b4xcollections _vvvvvvv5 = null;
public cm.jahswant.foodhunter.httputils2service _vvvvvvv6 = null;
public cm.jahswant.foodhunter.xuiviewsutils _vvvvvvv7 = null;
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _b4xpage_closerequest() throws Exception{
ResumableSub_B4XPage_CloseRequest rsub = new ResumableSub_B4XPage_CloseRequest(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_B4XPage_CloseRequest extends BA.ResumableSub {
public ResumableSub_B4XPage_CloseRequest(cm.jahswant.foodhunter.b4xmainpage parent) {
this.parent = parent;
}
cm.jahswant.foodhunter.b4xmainpage parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
 //BA.debugLineNum = 61;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 //BA.debugLineNum = 62;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
ResumableSub_B4XPage_Created rsub = new ResumableSub_B4XPage_Created(this,_root1);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Created extends BA.ResumableSub {
public ResumableSub_B4XPage_Created(cm.jahswant.foodhunter.b4xmainpage parent,anywheresoftware.b4a.objects.B4XViewWrapper _root1) {
this.parent = parent;
this._root1 = _root1;
}
cm.jahswant.foodhunter.b4xmainpage parent;
anywheresoftware.b4a.objects.B4XViewWrapper _root1;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 28;BA.debugLine="Root = Root1";
parent._vvvvv7 = _root1;
 //BA.debugLineNum = 29;BA.debugLine="Root.LoadLayout(\"splash\")";
parent._vvvvv7.LoadLayout("splash",ba);
 //BA.debugLineNum = 31;BA.debugLine="SQLDataBasePath = xui.DefaultFolder";
parent._vvvvvv6 = parent._vvvvv0.getDefaultFolder();
 //BA.debugLineNum = 32;BA.debugLine="SQLDateBaseName = \"BLESSING_db.db\"";
parent._vvvvvv7 = "BLESSING_db.db";
 //BA.debugLineNum = 36;BA.debugLine="If File.Exists(SQLDataBasePath, SQLDateBaseName)";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.File.Exists(parent._vvvvvv6,parent._vvvvvv7)==parent.__c.False) { 
this.state = 3;
}else if(parent.__c.File.Exists(parent._vvvvvv6,parent._vvvvvv7)==parent.__c.True) { 
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 38;BA.debugLine="File.Copy(File.DirAssets, SQLDateBaseName, SQLDa";
parent.__c.File.Copy(parent.__c.File.getDirAssets(),parent._vvvvvv7,parent._vvvvvv6,parent._vvvvvv7);
 //BA.debugLineNum = 40;BA.debugLine="SQL.Initialize(SQLDataBasePath, SQLDateBaseName,";
parent._vvvvvv4.Initialize(parent._vvvvvv6,parent._vvvvvv7,parent.__c.True);
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 45;BA.debugLine="SQL.Initialize(SQLDataBasePath, SQLDateBaseName,";
parent._vvvvvv4.Initialize(parent._vvvvvv6,parent._vvvvvv7,parent.__c.True);
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 48;BA.debugLine="Welcome.Initialize";
parent._vvvvvv2._initialize /*Object*/ (ba);
 //BA.debugLineNum = 49;BA.debugLine="UserMenu.Initialize";
parent._vvvvvv3._initialize /*Object*/ (ba);
 //BA.debugLineNum = 51;BA.debugLine="B4XPages.AddPage(\"WELCOME\",Welcome)";
parent._vvvvvvv4._vv3 /*String*/ (ba,"WELCOME",(Object)(parent._vvvvvv2));
 //BA.debugLineNum = 52;BA.debugLine="B4XPages.AddPage(\"USERMENU\",UserMenu)";
parent._vvvvvvv4._vv3 /*String*/ (ba,"USERMENU",(Object)(parent._vvvvvv3));
 //BA.debugLineNum = 54;BA.debugLine="Sleep(2500)";
parent.__c.Sleep(ba,this,(int) (2500));
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
 //BA.debugLineNum = 55;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"WELCOME\"";
parent._vvvvvvv4._vvv7 /*String*/ (ba,"WELCOME");
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private Root As B4XView";
_vvvvv7 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private xui As XUI";
_vvvvv0 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 12;BA.debugLine="Public ServerAddress As String = \"https://144.217";
_vvvvvv1 = "https://144.217.85.221:17179";
 //BA.debugLineNum = 13;BA.debugLine="Public HTTP_ReqPass As String = \"J%uge7NBS6&Wc^vS";
_http_reqpass = "J%uge7NBS6&Wc^vS7$?bSG^!@AjbcByR^Pb=ZY!jLZ$LGn87^8v2F2b7#22Pd-ME#gAsDKXn-%TZx-fmhdeuvH&ZH7zp*5Z_z&jsb7wpRrUYaccwaLUTM7!_hQB7VJtD";
 //BA.debugLineNum = 14;BA.debugLine="Dim Welcome As WelcomePage";
_vvvvvv2 = new cm.jahswant.foodhunter.welcomepage();
 //BA.debugLineNum = 15;BA.debugLine="Dim UserMenu As UserMenuPage";
_vvvvvv3 = new cm.jahswant.foodhunter.usermenupage();
 //BA.debugLineNum = 16;BA.debugLine="Public SQL As SQL";
_vvvvvv4 = new anywheresoftware.b4a.sql.SQL();
 //BA.debugLineNum = 17;BA.debugLine="Public Rs As ResultSet";
_vvvvvv5 = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Public SQLDataBasePath As String";
_vvvvvv6 = "";
 //BA.debugLineNum = 19;BA.debugLine="Public SQLDateBaseName  As String";
_vvvvvv7 = "";
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public int  _vvvvv6(String _hex) throws Exception{
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
int[] _ints = null;
 //BA.debugLineNum = 66;BA.debugLine="Public Sub HexToColor(Hex As String) As Int";
 //BA.debugLineNum = 67;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
 //BA.debugLineNum = 68;BA.debugLine="If Hex.StartsWith(\"#\") Then";
if (_hex.startsWith("#")) { 
 //BA.debugLineNum = 69;BA.debugLine="Hex = Hex.SubString(1)";
_hex = _hex.substring((int) (1));
 }else if(_hex.startsWith("0x")) { 
 //BA.debugLineNum = 71;BA.debugLine="Hex = Hex.SubString(2)";
_hex = _hex.substring((int) (2));
 };
 //BA.debugLineNum = 73;BA.debugLine="Dim ints() As Int = bc.IntsFromBytes(bc.HexToByte";
_ints = _bc.IntsFromBytes(_bc.HexToBytes(_hex));
 //BA.debugLineNum = 74;BA.debugLine="Return ints(0)";
if (true) return _ints[(int) (0)];
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}

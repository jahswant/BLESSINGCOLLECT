package cm.jahswant.foodhunter;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class usermenupage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "cm.jahswant.foodhunter.usermenupage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", cm.jahswant.foodhunter.usermenupage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public boolean _vvvvvvvv4 = false;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvv7 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvv0 = null;
public de.amberhome.objects.appcompat.ACActionBar _vvvvvvvv5 = null;
public de.amberhome.objects.appcompat.AppCompatBase _vvvvvvvv6 = null;
public de.amberhome.objects.appcompat.ACToolbarLightWrapper _actoolbarlight1 = null;
public cm.jahswant.foodhunter.bctoast _vvvvvvvv7 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlcontent = null;
public b4a.example3.customlistview _customlistvieworders = null;
public cm.jahswant.foodhunter.b4ximageview _imageviewprofile = null;
public cm.jahswant.foodhunter.b4ximageview _imglogout = null;
public cm.jahswant.foodhunter.b4ximageview _imgprofile = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfullnames = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblstatus = null;
public anywheresoftware.b4a.objects.PanelWrapper _menusignuser = null;
public anywheresoftware.b4a.objects.PanelWrapper _imageviewprofilepnl = null;
public anywheresoftware.b4a.objects.PanelWrapper _imglogoutpnl = null;
public anywheresoftware.b4a.objects.RuntimePermissions _vvvvvvvv0 = null;
public cm.jahswant.foodhunter.wobblemenu _bottomwobblemenu = null;
public anywheresoftware.b4a.objects.MapFragmentWrapper _mapfragmentaddress = null;
public anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper _vvvvvvvvv1 = null;
public boolean _vvvvvvvvv2 = false;
public anywheresoftware.b4a.objects.PanelWrapper _basepanel = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblafternoon = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblafternooncollect = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldayname = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmorning = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmorningcollect = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelline = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imglogos = null;
public cm.jahswant.foodhunter.b4xdialog _vvvvvvvvv3 = null;
public String[] _vvvvvvvvv4 = null;
public cm.jahswant.foodhunter.b4ximageview _b4ximageviewlogo = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnpay = null;
public anywheresoftware.b4a.objects.LabelWrapper _imgcancelme = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblheadertext = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelback = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlcancel = null;
public cm.jahswant.foodhunter.metroui_textview _txtmomotelephone = null;
public anywheresoftware.b4a.objects.IME _vvvvvvvvv5 = null;
public b4a.example.dateutils _vvvvvv0 = null;
public cm.jahswant.foodhunter.main _vvvvvvv1 = null;
public cm.jahswant.foodhunter.utils _vvvvvvv2 = null;
public cm.jahswant.foodhunter.starter _vvvvvvv3 = null;
public cm.jahswant.foodhunter.b4xpages _vvvvvvv4 = null;
public cm.jahswant.foodhunter.b4xcollections _vvvvvvv5 = null;
public cm.jahswant.foodhunter.httputils2service _vvvvvvv6 = null;
public cm.jahswant.foodhunter.xuiviewsutils _vvvvvvv7 = null;
public String  _actoolbarlight1_navigationitemclick() throws Exception{
 //BA.debugLineNum = 223;BA.debugLine="Sub ACToolBarLight1_NavigationItemClick";
 //BA.debugLineNum = 224;BA.debugLine="B4XPage_CloseRequest";
_b4xpage_closerequest();
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_appear() throws Exception{
 //BA.debugLineNum = 202;BA.debugLine="Private Sub B4XPage_Appear";
 //BA.debugLineNum = 203;BA.debugLine="If B4XPageHasResized = True Then";
if (_vvvvvvvv4==__c.True) { 
 };
 //BA.debugLineNum = 205;BA.debugLine="B4XPageHasResized = True";
_vvvvvvvv4 = __c.True;
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _b4xpage_closerequest() throws Exception{
ResumableSub_B4XPage_CloseRequest rsub = new ResumableSub_B4XPage_CloseRequest(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_B4XPage_CloseRequest extends BA.ResumableSub {
public ResumableSub_B4XPage_CloseRequest(cm.jahswant.foodhunter.usermenupage parent) {
this.parent = parent;
}
cm.jahswant.foodhunter.usermenupage parent;
Object _sf = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 188;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 10;
this.catchState = 9;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 9;
 //BA.debugLineNum = 190;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"DO YOU REAL";
_sf = parent._vvvvv0.Msgbox2Async(ba,BA.ObjectToCharSequence("DO YOU REALLY WANT TO QUIT ?"),BA.ObjectToCharSequence("BLESSING COLLECT"),"YES","","NO",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)));
 //BA.debugLineNum = 191;BA.debugLine="Wait For (sf) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, _sf);
this.state = 11;
return;
case 11:
//C
this.state = 4;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 192;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_result==parent._vvvvv0.DialogResponse_Positive) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 193;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
 //BA.debugLineNum = 197;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("01835018",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 199;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public void  _msgbox_result(int _result) throws Exception{
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
int _i = 0;
 //BA.debugLineNum = 53;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 54;BA.debugLine="Root = Root1";
_vvvvv7 = _root1;
 //BA.debugLineNum = 55;BA.debugLine="Toast.Initialize(Root)";
_vvvvvvvv7._initialize /*String*/ (ba,_vvvvv7);
 //BA.debugLineNum = 56;BA.debugLine="Toast.DefaultTextColor = Colors.White";
_vvvvvvvv7._vvvvvvvvvvvvvvvvvvvvv1 /*int*/  = __c.Colors.White;
 //BA.debugLineNum = 57;BA.debugLine="Toast.pnl.Color = B4XPages.MainPage.HexToColor(\"#";
_vvvvvvvv7._vvvvvvvvvvvvvvvvvvvv4 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(_vvvvvvv4._vvv4 /*cm.jahswant.foodhunter.b4xmainpage*/ (ba)._vvvvv6 /*int*/ ("#FF222D32"));
 //BA.debugLineNum = 58;BA.debugLine="Root.LoadLayout(\"action_bar\")";
_vvvvv7.LoadLayout("action_bar",ba);
 //BA.debugLineNum = 60;BA.debugLine="ACToolBarLight1.SetAsActionBar";
_actoolbarlight1.SetAsActionBar(ba);
 //BA.debugLineNum = 61;BA.debugLine="ACToolBarLight1.InitMenuListener";
_actoolbarlight1.InitMenuListener();
 //BA.debugLineNum = 63;BA.debugLine="Ac.SetElevation(ACToolBarLight1, 0dip)";
_vvvvvvvv6.SetElevation((android.view.View)(_actoolbarlight1.getObject()),(float) (__c.DipToCurrent((int) (0))));
 //BA.debugLineNum = 65;BA.debugLine="ToolbarHelper.Initialize ' ABHelper was dimmed as";
_vvvvvvvv5.Initialize(ba);
 //BA.debugLineNum = 66;BA.debugLine="ToolbarHelper.ShowUpIndicator = False ' Need to s";
_vvvvvvvv5.setShowUpIndicator(__c.False);
 //BA.debugLineNum = 68;BA.debugLine="ACToolBarLight1.Title = \"BLESSING COLLECT\"";
_actoolbarlight1.setTitle(BA.ObjectToCharSequence("BLESSING COLLECT"));
 //BA.debugLineNum = 69;BA.debugLine="ACToolBarLight1.SubTitle = \"WELCOME\"";
_actoolbarlight1.setSubTitle(BA.ObjectToCharSequence("WELCOME"));
 //BA.debugLineNum = 71;BA.debugLine="PnlContent.LoadLayout(\"userdash\")";
_pnlcontent.LoadLayout("userdash",ba);
 //BA.debugLineNum = 72;BA.debugLine="cd.Initialize(PnlContent)";
_vvvvvvvvv3._initialize /*String*/ (ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnlcontent.getObject())));
 //BA.debugLineNum = 74;BA.debugLine="IME.Initialize(\"IME\")";
_vvvvvvvvv5.Initialize("IME");
 //BA.debugLineNum = 76;BA.debugLine="BottomWobbleMenu.SetTabTextIcon(1,\"HOME\",Chr(0xF0";
_bottomwobblemenu._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ((int) (1),"HOME",BA.ObjectToString(__c.Chr(((int)0xf015))),(anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.getFONTAWESOME())));
 //BA.debugLineNum = 77;BA.debugLine="BottomWobbleMenu.SetTabTextIcon(2,\"ADD MONEY\",Chr";
_bottomwobblemenu._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ((int) (2),"ADD MONEY",BA.ObjectToString(__c.Chr(((int)0xf0ed))),(anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.getFONTAWESOME())));
 //BA.debugLineNum = 78;BA.debugLine="BottomWobbleMenu.SetTabTextIcon(3,\"SEND MONEY\",Ch";
_bottomwobblemenu._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ((int) (3),"SEND MONEY",BA.ObjectToString(__c.Chr(((int)0xf0ee))),(anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.getFONTAWESOME())));
 //BA.debugLineNum = 79;BA.debugLine="BottomWobbleMenu.SetTabTextIcon(4,\"NEAR BY\",Chr(0";
_bottomwobblemenu._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ((int) (4),"NEAR BY",BA.ObjectToString(__c.Chr(((int)0xf041))),(anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.getFONTAWESOME())));
 //BA.debugLineNum = 80;BA.debugLine="BottomWobbleMenu.SetTabTextIcon(5,\"ABOUT US\",Chr(";
_bottomwobblemenu._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ((int) (5),"ABOUT US",BA.ObjectToString(__c.Chr(((int)0xf05a))),(anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.getFONTAWESOME())));
 //BA.debugLineNum = 82;BA.debugLine="BottomWobbleMenu.SetCurrentTab(1)";
_bottomwobblemenu._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 /*String*/ ((int) (1));
 //BA.debugLineNum = 84;BA.debugLine="imgProfile.Bitmap = LoadBitmap(File.DirAssets,\"1.";
_imgprofile._setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"1.jpg").getObject())));
 //BA.debugLineNum = 85;BA.debugLine="ImageViewProfile.Bitmap = LoadBitmap(File.DirAsse";
_imageviewprofile._setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"forget_pass.png").getObject())));
 //BA.debugLineNum = 86;BA.debugLine="imgLogout.Bitmap = LoadBitmap(File.DirAssets,\"log";
_imglogout._setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"logout.png").getObject())));
 //BA.debugLineNum = 88;BA.debugLine="Action = Array As String (\"DEBIT\",\"CREDIT\")";
_vvvvvvvvv4 = new String[]{"DEBIT","CREDIT"};
 //BA.debugLineNum = 90;BA.debugLine="For i = 0 To 30";
{
final int step26 = 1;
final int limit26 = (int) (30);
_i = (int) (0) ;
for (;_i <= limit26 ;_i = _i + step26 ) {
 //BA.debugLineNum = 91;BA.debugLine="If  i Mod 2  = 0 Then";
if (_i%2==0) { 
 //BA.debugLineNum = 92;BA.debugLine="CustomListViewOrders.Add(CreateItem3(CustomList";
_customlistvieworders._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_vvvvvvv0(_customlistvieworders._asview().getWidth(),_vvvvvvvvv4[(int) (0)],BA.NumberToString(__c.Rnd((int) (1000),(int) (5000)))+"0XAF",__c.DateTime.Date(__c.DateTime.getNow())).getObject())),(Object)(_i));
 }else {
 //BA.debugLineNum = 94;BA.debugLine="CustomListViewOrders.Add(CreateItem3(CustomList";
_customlistvieworders._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_vvvvvvv0(_customlistvieworders._asview().getWidth(),_vvvvvvvvv4[(int) (1)],BA.NumberToString(__c.Rnd((int) (1000),(int) (5000)))+"0XAF",__c.DateTime.Date(__c.DateTime.getNow())).getObject())),(Object)(_i));
 };
 }
};
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_menuclick(String _menu) throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="Sub B4XPage_MenuClick(Menu As String)";
 //BA.debugLineNum = 209;BA.debugLine="Try";
try { //BA.debugLineNum = 210;BA.debugLine="If Menu = \"back\" Then";
if ((_menu).equals("back")) { 
 //BA.debugLineNum = 211;BA.debugLine="B4XPage_CloseRequest";
_b4xpage_closerequest();
 }else if((_menu).equals("config")) { 
 //BA.debugLineNum = 213;BA.debugLine="ShowDialog";
_vvvvvvvv3();
 };
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 216;BA.debugLine="Log(LastException)";
__c.LogImpl("01966088",BA.ObjectToString(__c.LastException(ba)),0);
 };
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_resize(int _width,int _height) throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Sub B4XPage_Resize(Width As Int, Height As Int)";
 //BA.debugLineNum = 183;BA.debugLine="B4XPageHasResized = True";
_vvvvvvvv4 = __c.True;
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return "";
}
public String  _bottomwobblemenu_tab1click() throws Exception{
int _i = 0;
 //BA.debugLineNum = 229;BA.debugLine="Private Sub BottomWobbleMenu_Tab1Click";
 //BA.debugLineNum = 230;BA.debugLine="Try";
try { //BA.debugLineNum = 231;BA.debugLine="If B4XPageHasResized Then";
if (_vvvvvvvv4) { 
 //BA.debugLineNum = 232;BA.debugLine="For i = 0 To 30";
{
final int step3 = 1;
final int limit3 = (int) (30);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 233;BA.debugLine="For i = 0 To 30";
{
final int step4 = 1;
final int limit4 = (int) (30);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 234;BA.debugLine="If  i Mod 2  = 0 Then";
if (_i%2==0) { 
 //BA.debugLineNum = 235;BA.debugLine="CustomListViewOrders.Add(CreateItem3(CustomL";
_customlistvieworders._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_vvvvvvv0(_customlistvieworders._asview().getWidth(),_vvvvvvvvv4[(int) (0)],BA.NumberToString(__c.Rnd((int) (1000),(int) (5000)))+"0XAF",__c.DateTime.Date(__c.DateTime.getNow())).getObject())),(Object)(_i));
 }else {
 //BA.debugLineNum = 237;BA.debugLine="CustomListViewOrders.Add(CreateItem3(CustomL";
_customlistvieworders._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_vvvvvvv0(_customlistvieworders._asview().getWidth(),_vvvvvvvvv4[(int) (1)],BA.NumberToString(__c.Rnd((int) (1000),(int) (5000)))+"0XAF",__c.DateTime.Date(__c.DateTime.getNow())).getObject())),(Object)(_i));
 };
 }
};
 }
};
 };
 } 
       catch (Exception e14) {
			ba.setLastException(e14); //BA.debugLineNum = 244;BA.debugLine="Log(LastException)";
__c.LogImpl("02097167",BA.ObjectToString(__c.LastException(ba)),0);
 };
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return "";
}
public String  _bottomwobblemenu_tab3click() throws Exception{
 //BA.debugLineNum = 250;BA.debugLine="Private Sub BottomWobbleMenu_Tab3Click";
 //BA.debugLineNum = 251;BA.debugLine="Try";
try { //BA.debugLineNum = 252;BA.debugLine="ShowDialog";
_vvvvvvvv3();
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 254;BA.debugLine="Log(LastException)";
__c.LogImpl("02162692",BA.ObjectToString(__c.LastException(ba)),0);
 };
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return "";
}
public void  _bottomwobblemenu_tab4click() throws Exception{
ResumableSub_BottomWobbleMenu_Tab4Click rsub = new ResumableSub_BottomWobbleMenu_Tab4Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_BottomWobbleMenu_Tab4Click extends BA.ResumableSub {
public ResumableSub_BottomWobbleMenu_Tab4Click(cm.jahswant.foodhunter.usermenupage parent) {
this.parent = parent;
}
cm.jahswant.foodhunter.usermenupage parent;
boolean _success = false;
anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper _cp = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 267;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 10;
this.catchState = 9;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 9;
 //BA.debugLineNum = 268;BA.debugLine="B4XPageHasResized= True";
parent._vvvvvvvv4 = parent.__c.True;
 //BA.debugLineNum = 269;BA.debugLine="PnlContent.RemoveAllViews";
parent._pnlcontent.RemoveAllViews();
 //BA.debugLineNum = 270;BA.debugLine="PnlContent.LoadLayout(\"nearbyplaces\")";
parent._pnlcontent.LoadLayout("nearbyplaces",ba);
 //BA.debugLineNum = 271;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 11;
return;
case 11:
//C
this.state = 4;
;
 //BA.debugLineNum = 272;BA.debugLine="ACToolBarLight1.SubTitle = \"NEAR BY STATIONS\"";
parent._actoolbarlight1.setSubTitle(BA.ObjectToCharSequence("NEAR BY STATIONS"));
 //BA.debugLineNum = 273;BA.debugLine="Wait For (InitializeMap) Complete (Success As Bo";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvv2());
this.state = 12;
return;
case 12:
//C
this.state = 4;
_success = (Boolean) result[0];
;
 //BA.debugLineNum = 274;BA.debugLine="MapReady = Success";
parent._vvvvvvvvv2 = _success;
 //BA.debugLineNum = 275;BA.debugLine="If MapReady Then";
if (true) break;

case 4:
//if
this.state = 7;
if (parent._vvvvvvvvv2) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 276;BA.debugLine="gmap.Clear";
parent._vvvvvvvvv1.Clear();
 //BA.debugLineNum = 277;BA.debugLine="Dim cp As CameraPosition";
_cp = new anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper();
 //BA.debugLineNum = 278;BA.debugLine="cp.Initialize(\"4.058907\",\"9.702895\", 20)";
_cp.Initialize((double)(Double.parseDouble("4.058907")),(double)(Double.parseDouble("9.702895")),(float) (20));
 //BA.debugLineNum = 279;BA.debugLine="gmap.MoveCamera(cp)";
parent._vvvvvvvvv1.MoveCamera((com.google.android.gms.maps.model.CameraPosition)(_cp.getObject()));
 //BA.debugLineNum = 280;BA.debugLine="gmap.AddMarker(\"4.058910\",\"9.702800\", \"BLESSING";
parent._vvvvvvvvv1.AddMarker((double)(Double.parseDouble("4.058910")),(double)(Double.parseDouble("9.702800")),"BLESSING STATION A");
 //BA.debugLineNum = 281;BA.debugLine="gmap.AddMarker(\"4.058950\",\"9.702810\", \"BLESSING";
parent._vvvvvvvvv1.AddMarker((double)(Double.parseDouble("4.058950")),(double)(Double.parseDouble("9.702810")),"BLESSING STATION B");
 //BA.debugLineNum = 282;BA.debugLine="gmap.AddMarker(\"4.058960\",\"9.702895\", \"BLESSING";
parent._vvvvvvvvv1.AddMarker((double)(Double.parseDouble("4.058960")),(double)(Double.parseDouble("9.702895")),"BLESSING STATION C");
 //BA.debugLineNum = 283;BA.debugLine="gmap.AddMarker(\"4.058980\",\"9.702700\", \"BLESSING";
parent._vvvvvvvvv1.AddMarker((double)(Double.parseDouble("4.058980")),(double)(Double.parseDouble("9.702700")),"BLESSING STATION B");
 //BA.debugLineNum = 284;BA.debugLine="gmap.AddMarker(\"4.05900\",\"9.702880\", \"BLESSING";
parent._vvvvvvvvv1.AddMarker((double)(Double.parseDouble("4.05900")),(double)(Double.parseDouble("9.702880")),"BLESSING STATION E");
 //BA.debugLineNum = 285;BA.debugLine="gmap.AddMarker(\"4.059000\",\"9.702800\", \"BLESSING";
parent._vvvvvvvvv1.AddMarker((double)(Double.parseDouble("4.059000")),(double)(Double.parseDouble("9.702800")),"BLESSING STATION F");
 //BA.debugLineNum = 286;BA.debugLine="gmap.AddMarker(\"4.09100\",\"9.702810\", \"BLESSING";
parent._vvvvvvvvv1.AddMarker((double)(Double.parseDouble("4.09100")),(double)(Double.parseDouble("9.702810")),"BLESSING STATION G");
 //BA.debugLineNum = 287;BA.debugLine="gmap.AddMarker(\"4.059200\",\"9.702895\", \"BLESSING";
parent._vvvvvvvvv1.AddMarker((double)(Double.parseDouble("4.059200")),(double)(Double.parseDouble("9.702895")),"BLESSING STATION H");
 //BA.debugLineNum = 288;BA.debugLine="gmap.AddMarker(\"4.059300\",\"9.702700\", \"BLESSING";
parent._vvvvvvvvv1.AddMarker((double)(Double.parseDouble("4.059300")),(double)(Double.parseDouble("9.702700")),"BLESSING STATION I");
 //BA.debugLineNum = 289;BA.debugLine="gmap.AddMarker(\"4.059400\",\"9.702880\", \"BLESSING";
parent._vvvvvvvvv1.AddMarker((double)(Double.parseDouble("4.059400")),(double)(Double.parseDouble("9.702880")),"BLESSING STATION E");
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
 //BA.debugLineNum = 292;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("02228250",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public void  _complete(boolean _success) throws Exception{
}
public String  _bottomwobblemenu_tab5click() throws Exception{
 //BA.debugLineNum = 297;BA.debugLine="Private Sub BottomWobbleMenu_Tab5Click";
 //BA.debugLineNum = 298;BA.debugLine="Try";
try { //BA.debugLineNum = 299;BA.debugLine="B4XPageHasResized = True";
_vvvvvvvv4 = __c.True;
 //BA.debugLineNum = 300;BA.debugLine="PnlContent.RemoveAllViews";
_pnlcontent.RemoveAllViews();
 //BA.debugLineNum = 301;BA.debugLine="PnlContent.LoadLayout(\"aboutlayout\")";
_pnlcontent.LoadLayout("aboutlayout",ba);
 //BA.debugLineNum = 302;BA.debugLine="imgLogoS.Bitmap = LoadBitmap(File.DirAssets,\"bles";
_imglogos.setBitmap((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"blessing_logo_blanc.png").getObject()));
 //BA.debugLineNum = 303;BA.debugLine="ACToolBarLight1.SubTitle = \"ABOUT US\"";
_actoolbarlight1.setSubTitle(BA.ObjectToCharSequence("ABOUT US"));
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 305;BA.debugLine="Log(LastException)";
__c.LogImpl("02293768",BA.ObjectToString(__c.LastException(ba)),0);
 };
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return "";
}
public void  _btnpay_click() throws Exception{
ResumableSub_btnPay_Click rsub = new ResumableSub_btnPay_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnPay_Click extends BA.ResumableSub {
public ResumableSub_btnPay_Click(cm.jahswant.foodhunter.usermenupage parent) {
this.parent = parent;
}
cm.jahswant.foodhunter.usermenupage parent;
cm.jahswant.foodhunter.main._api_pay _downdata = null;
anywheresoftware.b4a.randomaccessfile.B4XSerializator _ser = null;
byte[] _uexkey = null;
cm.jahswant.foodhunter.httpjob _jobverif = null;
cm.jahswant.foodhunter.httpjob _job = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 141;BA.debugLine="If (txtMOMOTelephone.Text.Trim.Length > 9 Or txtM";
if (true) break;

case 1:
//if
this.state = 18;
if ((parent._txtmomotelephone._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*String*/ ().trim().length()>9 || parent._txtmomotelephone._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*String*/ ().trim().length()<9) || (parent.__c.IsNumber(parent._txtmomotelephone._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*String*/ ().trim())==parent.__c.False)) { 
this.state = 3;
}else if((parent._txtmomotelephone._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*String*/ ().trim().length()==9) && (parent.__c.IsNumber(parent._txtmomotelephone._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*String*/ ().trim()))) { 
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 18;
 //BA.debugLineNum = 142;BA.debugLine="Toast.Show(\"ENTER VALID MOMO PHONE\")";
parent._vvvvvvvv7._show /*void*/ ("ENTER VALID MOMO PHONE");
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 144;BA.debugLine="If GetMOMOOperator(txtMOMOTelephone.Text.Trim) <";
if (true) break;

case 6:
//if
this.state = 17;
if ((parent._vvvvvvvv1(parent._txtmomotelephone._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*String*/ ().trim())).equals("MTN") == false) { 
this.state = 8;
}else if((parent._vvvvvvvv1(parent._txtmomotelephone._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*String*/ ().trim())).equals("MTN")) { 
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 17;
 //BA.debugLineNum = 145;BA.debugLine="Toast.Show(\"ENTER VALID MOMO PHONE\")";
parent._vvvvvvvv7._show /*void*/ ("ENTER VALID MOMO PHONE");
 if (true) break;

case 10:
//C
this.state = 11;
 //BA.debugLineNum = 147;BA.debugLine="pnlCancel_Click";
parent._pnlcancel_click();
 //BA.debugLineNum = 149;BA.debugLine="ProgressDialogShow2(\"SENDING PAYMENT REQUEST\",T";
parent.__c.ProgressDialogShow2(ba,BA.ObjectToCharSequence("SENDING PAYMENT REQUEST"),parent.__c.True);
 //BA.debugLineNum = 150;BA.debugLine="IME.HideKeyboard";
parent._vvvvvvvvv5.HideKeyboard(ba);
 //BA.debugLineNum = 154;BA.debugLine="Dim DOWNDATA As API_PAY";
_downdata = new cm.jahswant.foodhunter.main._api_pay();
 //BA.debugLineNum = 155;BA.debugLine="DOWNDATA.Initialize";
_downdata.Initialize();
 //BA.debugLineNum = 156;BA.debugLine="DOWNDATA.ORDER_ID = \"10\"";
_downdata.ORDER_ID /*String*/  = "10";
 //BA.debugLineNum = 157;BA.debugLine="DOWNDATA.PHONE_MOMO = txtMOMOTelephone.Text.Tri";
_downdata.PHONE_MOMO /*String*/  = parent._txtmomotelephone._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*String*/ ().trim();
 //BA.debugLineNum = 158;BA.debugLine="Dim Ser As B4XSerializator";
_ser = new anywheresoftware.b4a.randomaccessfile.B4XSerializator();
 //BA.debugLineNum = 159;BA.debugLine="Dim UExKey() As Byte = UTILS.EncryptText((Ser.C";
_uexkey = parent._vvvvvvv2._v7 /*byte[]*/ (ba,(_ser.ConvertObjectToBytes((Object)(_downdata))),parent._vvvvvvv4._vvv4 /*cm.jahswant.foodhunter.b4xmainpage*/ (ba)._http_reqpass /*String*/ );
 //BA.debugLineNum = 160;BA.debugLine="Dim jobVerif As HttpJob";
_jobverif = new cm.jahswant.foodhunter.httpjob();
 //BA.debugLineNum = 161;BA.debugLine="jobVerif.Initialize(\"\", Me)";
_jobverif._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 162;BA.debugLine="jobVerif.PostBytes(B4XPages.MainPage.ServerAddr";
_jobverif._vvvvvvvvvvvvvvvvvvvvvvv7 /*String*/ (parent._vvvvvvv4._vvv4 /*cm.jahswant.foodhunter.b4xmainpage*/ (ba)._vvvvvv1 /*String*/ +"/requestpay",_uexkey);
 //BA.debugLineNum = 163;BA.debugLine="jobVerif.GetRequest.Timeout=60000";
_jobverif._vvvvvvvvvvvvvvvvvvvvvv0 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().setTimeout((int) (60000));
 //BA.debugLineNum = 164;BA.debugLine="Wait For (jobVerif) JobDone(Job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_jobverif));
this.state = 19;
return;
case 19:
//C
this.state = 11;
_job = (cm.jahswant.foodhunter.httpjob) result[0];
;
 //BA.debugLineNum = 165;BA.debugLine="If Job.Success Then";
if (true) break;

case 11:
//if
this.state = 16;
if (_job._vvvvvvvvvvvvvvvvvvvvvvvv7 /*boolean*/ ) { 
this.state = 13;
}else if(parent.__c.Not(_job._vvvvvvvvvvvvvvvvvvvvvvvv7 /*boolean*/ )) { 
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
 //BA.debugLineNum = 166;BA.debugLine="Log(Job.GetString)";
parent.__c.LogImpl("01703962",_job._vvvvvvvvvvvvvvvvvvvvvvv1 /*String*/ (),0);
 //BA.debugLineNum = 167;BA.debugLine="Toast.Show(\"PAYMENT REQUEST SENT\")";
parent._vvvvvvvv7._show /*void*/ ("PAYMENT REQUEST SENT");
 if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 169;BA.debugLine="Toast.Show(\"ERROR OCCURED\")";
parent._vvvvvvvv7._show /*void*/ ("ERROR OCCURED");
 if (true) break;

case 16:
//C
this.state = 17;
;
 //BA.debugLineNum = 171;BA.debugLine="jobVerif.Release";
_jobverif._vvvvvvvvvvvvvvvvvvvvvvvv5 /*String*/ ();
 //BA.debugLineNum = 173;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = -1;
;
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jobdone(cm.jahswant.foodhunter.httpjob _job) throws Exception{
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim B4XPageHasResized As Boolean = False";
_vvvvvvvv4 = __c.False;
 //BA.debugLineNum = 3;BA.debugLine="Private Root As B4XView 'ignore";
_vvvvv7 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI 'ignore";
_vvvvv0 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 6;BA.debugLine="Private ToolbarHelper As ACActionBar";
_vvvvvvvv5 = new de.amberhome.objects.appcompat.ACActionBar();
 //BA.debugLineNum = 7;BA.debugLine="Dim Ac As AppCompat";
_vvvvvvvv6 = new de.amberhome.objects.appcompat.AppCompatBase();
 //BA.debugLineNum = 8;BA.debugLine="Private ACToolBarLight1 As ACToolBarLight";
_actoolbarlight1 = new de.amberhome.objects.appcompat.ACToolbarLightWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private Toast As BCToast";
_vvvvvvvv7 = new cm.jahswant.foodhunter.bctoast();
 //BA.debugLineNum = 11;BA.debugLine="Private PnlContent As Panel";
_pnlcontent = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private CustomListViewOrders As CustomListView";
_customlistvieworders = new b4a.example3.customlistview();
 //BA.debugLineNum = 13;BA.debugLine="Private ImageViewProfile As B4XImageView";
_imageviewprofile = new cm.jahswant.foodhunter.b4ximageview();
 //BA.debugLineNum = 14;BA.debugLine="Private imgLogout As B4XImageView";
_imglogout = new cm.jahswant.foodhunter.b4ximageview();
 //BA.debugLineNum = 15;BA.debugLine="Private imgProfile As B4XImageView";
_imgprofile = new cm.jahswant.foodhunter.b4ximageview();
 //BA.debugLineNum = 16;BA.debugLine="Private lblFullNames As Label";
_lblfullnames = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private lblStatus As Label";
_lblstatus = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private MenuSignUser As Panel";
_menusignuser = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private ImageViewProfilePNL As Panel";
_imageviewprofilepnl = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private imgLogoutPNL As Panel";
_imglogoutpnl = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private rp As RuntimePermissions";
_vvvvvvvv0 = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 22;BA.debugLine="Private BottomWobbleMenu As WobbleMenu";
_bottomwobblemenu = new cm.jahswant.foodhunter.wobblemenu();
 //BA.debugLineNum = 23;BA.debugLine="Private MapFragmentAddress As MapFragment";
_mapfragmentaddress = new anywheresoftware.b4a.objects.MapFragmentWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private gmap As GoogleMap";
_vvvvvvvvv1 = new anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Dim MapReady As Boolean";
_vvvvvvvvv2 = false;
 //BA.debugLineNum = 26;BA.debugLine="Private BasePanel As Panel";
_basepanel = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private lblAfternoon As Label";
_lblafternoon = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private lblAfternoonCollect As Label";
_lblafternooncollect = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private lblDayName As Label";
_lbldayname = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private lblMorning As Label";
_lblmorning = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private lblMorningCollect As Label";
_lblmorningcollect = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private PanelLine As Panel";
_panelline = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private imgLogoS As ImageView";
_imglogos = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Dim cd As B4XDialog";
_vvvvvvvvv3 = new cm.jahswant.foodhunter.b4xdialog();
 //BA.debugLineNum = 35;BA.debugLine="Dim Action() As String";
_vvvvvvvvv4 = new String[(int) (0)];
java.util.Arrays.fill(_vvvvvvvvv4,"");
 //BA.debugLineNum = 36;BA.debugLine="Private B4XImageViewLOGO As B4XImageView";
_b4ximageviewlogo = new cm.jahswant.foodhunter.b4ximageview();
 //BA.debugLineNum = 37;BA.debugLine="Private btnPay As Button";
_btnpay = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private imgCancelMe As Label";
_imgcancelme = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private lblHeaderText As Label";
_lblheadertext = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private Panel2 As Panel";
_panel2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private PanelBack As Panel";
_panelback = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private pnlCancel As Panel";
_pnlcancel = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private txtMOMOTelephone As MetroUI_TextView";
_txtmomotelephone = new cm.jahswant.foodhunter.metroui_textview();
 //BA.debugLineNum = 44;BA.debugLine="Dim IME As IME";
_vvvvvvvvv5 = new anywheresoftware.b4a.objects.IME();
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _vvvvvvv0(int _width,String _day,String _time1,String _time2) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _height = 0;
 //BA.debugLineNum = 334;BA.debugLine="Private Sub CreateItem3(Width As Int, Day As Strin";
 //BA.debugLineNum = 335;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _vvvvv0.CreatePanel(ba,"");
 //BA.debugLineNum = 336;BA.debugLine="Dim height As Int = 120dip";
_height = __c.DipToCurrent((int) (120));
 //BA.debugLineNum = 337;BA.debugLine="If GetDeviceLayoutValues.ApproximateScreenSize <";
if (__c.GetDeviceLayoutValues(ba).getApproximateScreenSize()<4.5) { 
_height = __c.DipToCurrent((int) (80));};
 //BA.debugLineNum = 338;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Width, height)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
 //BA.debugLineNum = 339;BA.debugLine="p.LoadLayout(\"daysitem\")";
_p.LoadLayout("daysitem",ba);
 //BA.debugLineNum = 340;BA.debugLine="lblDayName.Text = Day";
_lbldayname.setText(BA.ObjectToCharSequence(_day));
 //BA.debugLineNum = 341;BA.debugLine="lblMorningCollect.Text = Time1";
_lblmorningcollect.setText(BA.ObjectToCharSequence(_time1));
 //BA.debugLineNum = 342;BA.debugLine="lblAfternoonCollect.Text = Time2";
_lblafternooncollect.setText(BA.ObjectToCharSequence(_time2));
 //BA.debugLineNum = 343;BA.debugLine="Return p";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_p.getObject()));
 //BA.debugLineNum = 344;BA.debugLine="End Sub";
return null;
}
public String  _vvvvvvvv1(String _phonenumber) throws Exception{
String _operator = "";
 //BA.debugLineNum = 124;BA.debugLine="Sub GetMOMOOperator(PhoneNumber As String) As Stri";
 //BA.debugLineNum = 125;BA.debugLine="Dim Operator As String = \"\"";
_operator = "";
 //BA.debugLineNum = 126;BA.debugLine="If PhoneNumber.StartsWith(\"650\") Or PhoneNumber.S";
if (_phonenumber.startsWith("650") || _phonenumber.startsWith("651") || _phonenumber.startsWith("652") || _phonenumber.startsWith("653") || _phonenumber.startsWith("654") || _phonenumber.startsWith("670") || _phonenumber.startsWith("671") || _phonenumber.startsWith("672") || _phonenumber.startsWith("673") || _phonenumber.startsWith("674") || _phonenumber.startsWith("675") || _phonenumber.startsWith("676") || _phonenumber.startsWith("677") || _phonenumber.startsWith("678") || _phonenumber.startsWith("679") || _phonenumber.startsWith("680")) { 
 //BA.debugLineNum = 127;BA.debugLine="Operator = \"MTN\"";
_operator = "MTN";
 }else if(_phonenumber.startsWith("655") || _phonenumber.startsWith("656") || _phonenumber.startsWith("657") || _phonenumber.startsWith("658") || _phonenumber.startsWith("659") || _phonenumber.startsWith("69")) { 
 //BA.debugLineNum = 129;BA.debugLine="Operator = \"ORANGE\"";
_operator = "ORANGE";
 }else if(_phonenumber.startsWith("66")) { 
 //BA.debugLineNum = 131;BA.debugLine="Operator = \"NEXTTEL\"";
_operator = "NEXTTEL";
 }else if(_phonenumber.startsWith("222") || _phonenumber.startsWith("233") || _phonenumber.startsWith("242") || _phonenumber.startsWith("243")) { 
 //BA.debugLineNum = 133;BA.debugLine="Operator = \"CAMTEL\"";
_operator = "CAMTEL";
 };
 //BA.debugLineNum = 135;BA.debugLine="Return Operator";
if (true) return _operator;
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 48;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vvvvvvvv2() throws Exception{
ResumableSub_InitializeMap rsub = new ResumableSub_InitializeMap(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_InitializeMap extends BA.ResumableSub {
public ResumableSub_InitializeMap(cm.jahswant.foodhunter.usermenupage parent) {
this.parent = parent;
}
cm.jahswant.foodhunter.usermenupage parent;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 320;BA.debugLine="Wait For gmap_Ready";
parent.__c.WaitFor("gmap_ready", ba, this, null);
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
 //BA.debugLineNum = 321;BA.debugLine="gmap = MapFragmentAddress.GetMap";
parent._vvvvvvvvv1 = parent._mapfragmentaddress.GetMap();
 //BA.debugLineNum = 322;BA.debugLine="If gmap.IsInitialized Then";
if (true) break;

case 1:
//if
this.state = 8;
if (parent._vvvvvvvvv1.IsInitialized()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 323;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOC";
parent._vvvvvvvv0.CheckAndRequest(ba,parent._vvvvvvvv0.PERMISSION_ACCESS_FINE_LOCATION);
 //BA.debugLineNum = 324;BA.debugLine="Wait For B4XPage_PermissionResult (Permission As";
parent.__c.WaitFor("b4xpage_permissionresult", ba, this, null);
this.state = 10;
return;
case 10:
//C
this.state = 4;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
 //BA.debugLineNum = 325;BA.debugLine="If Result Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_result) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 326;BA.debugLine="gmap.MyLocationEnabled = True";
parent._vvvvvvvvv1.setMyLocationEnabled(parent.__c.True);
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 //BA.debugLineNum = 329;BA.debugLine="Return gmap.IsInitialized";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent._vvvvvvvvv1.IsInitialized()));return;};
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _gmap_ready() throws Exception{
}
public void  _b4xpage_permissionresult(String _permission,boolean _result) throws Exception{
}
public String  _pnlcancel_click() throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Private Sub pnlCancel_Click";
 //BA.debugLineNum = 103;BA.debugLine="cd.Close(0)";
_vvvvvvvvv3._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*boolean*/ ((int) (0));
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvv3() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _dialogpnl = null;
 //BA.debugLineNum = 106;BA.debugLine="Public Sub ShowDialog";
 //BA.debugLineNum = 107;BA.debugLine="cd.BlurBackground = False";
_vvvvvvvvv3._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 /*boolean*/  = __c.False;
 //BA.debugLineNum = 108;BA.debugLine="cd.BackgroundColor = xui.Color_Transparent";
_vvvvvvvvv3._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*int*/  = _vvvvv0.Color_Transparent;
 //BA.debugLineNum = 109;BA.debugLine="cd.BorderCornersRadius =0";
_vvvvvvvvv3._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*int*/  = (int) (0);
 //BA.debugLineNum = 110;BA.debugLine="cd.BorderColor = B4XPages.MainPage.HexToColor(\"#F";
_vvvvvvvvv3._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*int*/  = _vvvvvvv4._vvv4 /*cm.jahswant.foodhunter.b4xmainpage*/ (ba)._vvvvv6 /*int*/ ("#FFFE3D3D");
 //BA.debugLineNum = 111;BA.debugLine="cd.PutAtTop = True";
_vvvvvvvvv3._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 /*boolean*/  = __c.True;
 //BA.debugLineNum = 112;BA.debugLine="cd.BorderWidth = 0";
_vvvvvvvvv3._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 /*int*/  = (int) (0);
 //BA.debugLineNum = 113;BA.debugLine="Dim DialogPNL As B4XView = xui.CreatePanel(\"Dialo";
_dialogpnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_dialogpnl = _vvvvv0.CreatePanel(ba,"DialogPNL");
 //BA.debugLineNum = 114;BA.debugLine="DialogPNL.SetLayoutAnimated(1, 0, 0, Root.Width-1";
_dialogpnl.SetLayoutAnimated((int) (1),(int) (0),(int) (0),(int) (_vvvvv7.getWidth()-__c.DipToCurrent((int) (10))),(int) (_vvvvv7.getHeight()/(double)2));
 //BA.debugLineNum = 115;BA.debugLine="DialogPNL.LoadLayout(\"paynow\")";
_dialogpnl.LoadLayout("paynow",ba);
 //BA.debugLineNum = 116;BA.debugLine="lblHeaderText.Text = \"USE MTN MOMO\"";
_lblheadertext.setText(BA.ObjectToCharSequence("USE MTN MOMO"));
 //BA.debugLineNum = 117;BA.debugLine="txtMOMOTelephone.Hint = \"PHONE NUMBER\"";
_txtmomotelephone._setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ("PHONE NUMBER");
 //BA.debugLineNum = 118;BA.debugLine="btnPay.Text = \"PAY NOW\"";
_btnpay.setText(BA.ObjectToCharSequence("PAY NOW"));
 //BA.debugLineNum = 119;BA.debugLine="B4XImageViewLOGO.Load(File.DirAssets,\"mtnmomo.png";
_b4ximageviewlogo._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 /*String*/ (__c.File.getDirAssets(),"mtnmomo.png");
 //BA.debugLineNum = 120;BA.debugLine="cd.ShowCustom(DialogPNL,\"\", \"\" ,\"\")";
_vvvvvvvvv3._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_dialogpnl,(Object)(""),(Object)(""),(Object)(""));
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}

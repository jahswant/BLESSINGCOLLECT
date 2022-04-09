package cm.jahswant.foodhunter;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class metroui_textview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "cm.jahswant.foodhunter.metroui_textview");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", cm.jahswant.foodhunter.metroui_textview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = "";
public Object _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvv0 = null;
public Object _vvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
public anywheresoftware.b4a.objects.LabelWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.LabelWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "";
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = false;
public anywheresoftware.b4a.objects.IME _vvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = "";
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = false;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = false;
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = "";
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "";
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = "";
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = false;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = "";
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
public double _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
public double _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
public b4a.example.dateutils _vvvvvv0 = null;
public cm.jahswant.foodhunter.main _vvvvvvv1 = null;
public cm.jahswant.foodhunter.utils _vvvvvvv2 = null;
public cm.jahswant.foodhunter.starter _vvvvvvv3 = null;
public cm.jahswant.foodhunter.b4xpages _vvvvvvv4 = null;
public cm.jahswant.foodhunter.b4xcollections _vvvvvvv5 = null;
public cm.jahswant.foodhunter.httputils2service _vvvvvvv6 = null;
public cm.jahswant.foodhunter.xuiviewsutils _vvvvvvv7 = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Private Sub Class_Globals";
 //BA.debugLineNum = 53;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = "";
 //BA.debugLineNum = 54;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new Object();
 //BA.debugLineNum = 55;BA.debugLine="Public mBase As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 56;BA.debugLine="Private xui As XUI 'ignore";
_vvvvv0 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 57;BA.debugLine="Public Tag As Object";
_vvvvvvvvvvvvvvvvvvvvvvvvv7 = new Object();
 //BA.debugLineNum = 58;BA.debugLine="Private mProps As Map";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 59;BA.debugLine="Private MyTextBox As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 61;BA.debugLine="Private Myimageview As ImageView ' Resim Oluştuğu";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 62;BA.debugLine="Private MyDikeyCizgiLabel As Label";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 63;BA.debugLine="Private MyHintPanel As Panel";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 64;BA.debugLine="Private MyHintLabel As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 65;BA.debugLine="Private MyHLabel As Label 'MyHintLabel Buna Eşitl";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 66;BA.debugLine="Private MyPanel As Panel";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 67;BA.debugLine="Private TextboxOkeyButton As Label";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 69;BA.debugLine="Private ArkaPlanRadius As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
 //BA.debugLineNum = 70;BA.debugLine="Private ArkaPlanRengi As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
 //BA.debugLineNum = 72;BA.debugLine="Private HintArkaPlanRengi As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
 //BA.debugLineNum = 74;BA.debugLine="Private BorderWidth As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
 //BA.debugLineNum = 75;BA.debugLine="Private BorderColor As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
 //BA.debugLineNum = 76;BA.debugLine="Private HintLabelColor As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
 //BA.debugLineNum = 77;BA.debugLine="Private LineColor As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
 //BA.debugLineNum = 78;BA.debugLine="Private DoneButtonColor As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
 //BA.debugLineNum = 79;BA.debugLine="Private TextColor As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
 //BA.debugLineNum = 80;BA.debugLine="Private HintName As String";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "";
 //BA.debugLineNum = 81;BA.debugLine="Private PasswordMode As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
 //BA.debugLineNum = 83;BA.debugLine="Private SingleLine As Boolean 'ignore";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = false;
 //BA.debugLineNum = 84;BA.debugLine="Private IME As IME";
_vvvvvvvvv5 = new anywheresoftware.b4a.objects.IME();
 //BA.debugLineNum = 85;BA.debugLine="Dim MyTextBoxB4X As EditText";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 91;BA.debugLine="Private TextboxInput As String";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = "";
 //BA.debugLineNum = 92;BA.debugLine="Private DoneButton As Boolean 'ignore";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = false;
 //BA.debugLineNum = 93;BA.debugLine="Private DoneButtonKeyboardHide As Boolean 'ignore";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = false;
 //BA.debugLineNum = 94;BA.debugLine="Private Defaultimage As String 'ignore";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = "";
 //BA.debugLineNum = 95;BA.debugLine="Private Errorimage As String 'ignore";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "";
 //BA.debugLineNum = 96;BA.debugLine="Private Warningimage As String";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = "";
 //BA.debugLineNum = 97;BA.debugLine="Private HintUpEnable As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = false;
 //BA.debugLineNum = 98;BA.debugLine="Private HintNameUpColor As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
 //BA.debugLineNum = 99;BA.debugLine="Private HintNameUpText As String";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = "";
 //BA.debugLineNum = 100;BA.debugLine="Private NormalLeft As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
 //BA.debugLineNum = 101;BA.debugLine="Private NormalHintArkaPlanUzunlugu As Double";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
 //BA.debugLineNum = 102;BA.debugLine="Private YukardaHintArkaPlanUzunlugu As Double";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
 //BA.debugLineNum = 105;BA.debugLine="Private ilkAcilis As Boolean=True";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = __c.True;
 //BA.debugLineNum = 106;BA.debugLine="Private Normalimage As Bitmap";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvv6() throws Exception{
 //BA.debugLineNum = 489;BA.debugLine="Sub Clear";
 //BA.debugLineNum = 492;BA.debugLine="If ilkAcilis=True Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0==__c.True) { 
 //BA.debugLineNum = 494;BA.debugLine="MyTextBox.Text=\"\"";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 496;BA.debugLine="If HintUpEnable = True Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2==__c.True) { 
 //BA.debugLineNum = 497;BA.debugLine="MyHintLabel.Width=YukardaHintArkaPlanUzunlugu";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setWidth((int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7));
 //BA.debugLineNum = 498;BA.debugLine="MyHintLabel.Text=HintNameUpText";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setText(BA.ObjectToCharSequence(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4));
 //BA.debugLineNum = 499;BA.debugLine="MyHintLabel.TextColor=HintNameUpColor";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setTextColor(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
 };
 //BA.debugLineNum = 501;BA.debugLine="If MyTextBox.Text.Length=0 Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getText().length()==0) { 
 //BA.debugLineNum = 503;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.SetLayoutAnimated((int) (200),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getLeft(),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getHeight()/(double)2),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getWidth(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getHeight());
 }else {
 //BA.debugLineNum = 508;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.SetLayoutAnimated((int) (200),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getLeft(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getTop(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getWidth(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getHeight());
 };
 };
 //BA.debugLineNum = 512;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1() throws Exception{
anywheresoftware.b4a.objects.drawable.ColorDrawable _panelarkaplanozellikleri = null;
 //BA.debugLineNum = 361;BA.debugLine="Public Sub ClearError";
 //BA.debugLineNum = 362;BA.debugLine="Myimageview.Bitmap=Normalimage";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setBitmap((android.graphics.Bitmap)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getObject()));
 //BA.debugLineNum = 366;BA.debugLine="Dim PanelArkaPlanOzellikleri As ColorDrawable";
_panelarkaplanozellikleri = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 367;BA.debugLine="PanelArkaPlanOzellikleri.Initialize2(Colors.White";
_panelarkaplanozellikleri.Initialize2(__c.Colors.White,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
 //BA.debugLineNum = 368;BA.debugLine="MyPanel.Background=PanelArkaPlanOzellikleri";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setBackground((android.graphics.drawable.Drawable)(_panelarkaplanozellikleri.getObject()));
 //BA.debugLineNum = 374;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.drawable.ColorDrawable _panelarkaplanozellikleri = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _mydikeycizgilabeldrawable = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _myhintlabeldrawable = null;
int _hintyukseklik = 0;
int _sizex = 0;
int _i = 0;
 //BA.debugLineNum = 143;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
 //BA.debugLineNum = 144;BA.debugLine="My_initialize";
_my_initialize();
 //BA.debugLineNum = 145;BA.debugLine="mBase=Base";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base.getObject()));
 //BA.debugLineNum = 146;BA.debugLine="Tag = mBase.Tag";
_vvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getTag();
 //BA.debugLineNum = 147;BA.debugLine="mBase.Tag = Me";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setTag(this);
 //BA.debugLineNum = 148;BA.debugLine="mProps = Props";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _props;
 //BA.debugLineNum = 150;BA.debugLine="ArkaPlanRadius=Props.Get(\"ArkaPlanRadius\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = (int)(BA.ObjectToNumber(_props.Get((Object)("ArkaPlanRadius"))));
 //BA.debugLineNum = 151;BA.debugLine="ArkaPlanRengi=Props.Get(\"ArkaPlanRengi\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = (int)(BA.ObjectToNumber(_props.Get((Object)("ArkaPlanRengi"))));
 //BA.debugLineNum = 153;BA.debugLine="HintArkaPlanRengi=Props.Get(\"HintArkaPlanRengi\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = (int)(BA.ObjectToNumber(_props.Get((Object)("HintArkaPlanRengi"))));
 //BA.debugLineNum = 155;BA.debugLine="BorderWidth=Props.Get(\"BorderWidth\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = (int)(BA.ObjectToNumber(_props.Get((Object)("BorderWidth"))));
 //BA.debugLineNum = 156;BA.debugLine="BorderColor=Props.Get(\"BorderColor\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = (int)(BA.ObjectToNumber(_props.Get((Object)("BorderColor"))));
 //BA.debugLineNum = 157;BA.debugLine="HintLabelColor=Props.Get(\"HintLabelColor\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = (int)(BA.ObjectToNumber(_props.Get((Object)("HintLabelColor"))));
 //BA.debugLineNum = 158;BA.debugLine="LineColor=Props.Get(\"LineColor\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int)(BA.ObjectToNumber(_props.Get((Object)("LineColor"))));
 //BA.debugLineNum = 159;BA.debugLine="DoneButtonColor=Props.Get(\"DoneButtonColor\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = (int)(BA.ObjectToNumber(_props.Get((Object)("DoneButtonColor"))));
 //BA.debugLineNum = 160;BA.debugLine="TextColor=Props.Get(\"TextColor\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = (int)(BA.ObjectToNumber(_props.Get((Object)("TextColor"))));
 //BA.debugLineNum = 161;BA.debugLine="HintName=Props.Get(\"HintName\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = BA.ObjectToString(_props.Get((Object)("HintName")));
 //BA.debugLineNum = 162;BA.debugLine="PasswordMode=Props.Get(\"PasswordMode\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = BA.ObjectToBoolean(_props.Get((Object)("PasswordMode")));
 //BA.debugLineNum = 165;BA.debugLine="SingleLine=Props.Get(\"SingleLine\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = BA.ObjectToBoolean(_props.Get((Object)("SingleLine")));
 //BA.debugLineNum = 168;BA.debugLine="TextboxInput=Props.Get(\"TextboxInput\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = BA.ObjectToString(_props.Get((Object)("TextboxInput")));
 //BA.debugLineNum = 169;BA.debugLine="DoneButton=Props.Get(\"DoneButton\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = BA.ObjectToBoolean(_props.Get((Object)("DoneButton")));
 //BA.debugLineNum = 170;BA.debugLine="DoneButtonKeyboardHide=Props.Get(\"DoneButtonKeybo";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = BA.ObjectToBoolean(_props.Get((Object)("DoneButtonKeyboardHide")));
 //BA.debugLineNum = 171;BA.debugLine="Defaultimage=Props.Get(\"ResimBitmapString\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = BA.ObjectToString(_props.Get((Object)("ResimBitmapString")));
 //BA.debugLineNum = 172;BA.debugLine="Errorimage=Props.Get(\"Errorimage\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = BA.ObjectToString(_props.Get((Object)("Errorimage")));
 //BA.debugLineNum = 173;BA.debugLine="Warningimage=Props.Get(\"Warningimage\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = BA.ObjectToString(_props.Get((Object)("Warningimage")));
 //BA.debugLineNum = 175;BA.debugLine="If Props.Get(\"HintUpEnable\")=\"null\" Then";
if ((_props.Get((Object)("HintUpEnable"))).equals((Object)("null"))) { 
 //BA.debugLineNum = 176;BA.debugLine="HintUpEnable=False";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = __c.False;
 }else {
 //BA.debugLineNum = 178;BA.debugLine="HintUpEnable=Props.Get(\"HintUpEnable\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = BA.ObjectToBoolean(_props.Get((Object)("HintUpEnable")));
 };
 //BA.debugLineNum = 181;BA.debugLine="HintNameUpColor=Props.Get(\"HintNameUpColor\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = (int)(BA.ObjectToNumber(_props.Get((Object)("HintNameUpColor"))));
 //BA.debugLineNum = 182;BA.debugLine="HintNameUpText=Props.Get(\"HintNameUpText\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = BA.ObjectToString(_props.Get((Object)("HintNameUpText")));
 //BA.debugLineNum = 184;BA.debugLine="MyTextBox.Color=Colors.Transparent";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 186;BA.debugLine="If DoneButton=True Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5==__c.True) { 
 //BA.debugLineNum = 187;BA.debugLine="TextboxOkeyButton.TextColor=DoneButtonColor";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setTextColor(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
 //BA.debugLineNum = 188;BA.debugLine="TextboxOkeyButton.Visible=False";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setVisible(__c.False);
 //BA.debugLineNum = 190;BA.debugLine="TextboxOkeyButton.Typeface=Typeface.MATERIALICON";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setTypeface(__c.Typeface.getMATERIALICONS());
 //BA.debugLineNum = 191;BA.debugLine="TextboxOkeyButton.TextSize=16";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setTextSize((float) (16));
 }else {
 //BA.debugLineNum = 196;BA.debugLine="TextboxOkeyButton.Visible=False";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setVisible(__c.False);
 //BA.debugLineNum = 197;BA.debugLine="TextboxOkeyButton.TextColor=Colors.Transparent";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setTextColor(__c.Colors.Transparent);
 };
 //BA.debugLineNum = 200;BA.debugLine="mBase.Color=Colors.Transparent";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 204;BA.debugLine="Dim PanelArkaPlanOzellikleri As ColorDrawable";
_panelarkaplanozellikleri = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 205;BA.debugLine="PanelArkaPlanOzellikleri.Initialize2(ArkaPlanReng";
_panelarkaplanozellikleri.Initialize2(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
 //BA.debugLineNum = 206;BA.debugLine="MyPanel.Background=PanelArkaPlanOzellikleri";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setBackground((android.graphics.drawable.Drawable)(_panelarkaplanozellikleri.getObject()));
 //BA.debugLineNum = 208;BA.debugLine="Dim MyDikeyCizgiLabelDrawable As ColorDrawable";
_mydikeycizgilabeldrawable = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 209;BA.debugLine="MyDikeyCizgiLabelDrawable.Initialize2(LineColor,5";
_mydikeycizgilabeldrawable.Initialize2(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5,(int) (50),(int) (0),__c.Colors.Black);
 //BA.debugLineNum = 210;BA.debugLine="MyDikeyCizgiLabel.Background=MyDikeyCizgiLabelDra";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.setBackground((android.graphics.drawable.Drawable)(_mydikeycizgilabeldrawable.getObject()));
 //BA.debugLineNum = 212;BA.debugLine="Dim MyHintLabelDrawable As ColorDrawable";
_myhintlabeldrawable = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 213;BA.debugLine="MyHintLabelDrawable.Initialize2(HintArkaPlanRengi";
_myhintlabeldrawable.Initialize2(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1,(int) (10),(int) (0),(int) (0));
 //BA.debugLineNum = 214;BA.debugLine="MyHLabel.background=MyHintLabelDrawable";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.setBackground((android.graphics.drawable.Drawable)(_myhintlabeldrawable.getObject()));
 //BA.debugLineNum = 217;BA.debugLine="If Defaultimage=\"null\" Or Defaultimage = \"\" Then";
if ((_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7).equals("null") || (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7).equals("")) { 
 //BA.debugLineNum = 218;BA.debugLine="Normalimage=Null";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(__c.Null));
 //BA.debugLineNum = 219;BA.debugLine="Normalimage.InitializeMutable(30dip,30dip)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.InitializeMutable(__c.DipToCurrent((int) (30)),__c.DipToCurrent((int) (30)));
 }else {
 //BA.debugLineNum = 221;BA.debugLine="Normalimage=LoadBitmap(File.DirAssets,Defaultima";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = __c.LoadBitmap(__c.File.getDirAssets(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
 //BA.debugLineNum = 222;BA.debugLine="Myimageview.Bitmap=Normalimage";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setBitmap((android.graphics.Bitmap)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getObject()));
 };
 //BA.debugLineNum = 225;BA.debugLine="Myimageview.Gravity=Gravity.FILL";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 226;BA.debugLine="MyTextBox.TextColor=TextColor";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setTextColor(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
 //BA.debugLineNum = 227;BA.debugLine="MyTextBoxB4X.SingleLine=SingleLine";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setSingleLine(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2);
 //BA.debugLineNum = 231;BA.debugLine="If TextboxInput = \"TEXT\" Then";
if ((_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4).equals("TEXT")) { 
 //BA.debugLineNum = 232;BA.debugLine="MyTextBoxB4X.InputType=MyTextBoxB4X.INPUT_TYPE_T";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setInputType(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.INPUT_TYPE_TEXT);
 }else if((_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4).equals("NUMBERS")) { 
 //BA.debugLineNum = 234;BA.debugLine="MyTextBoxB4X.InputType= MyTextBoxB4X.INPUT_TYPE_";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setInputType(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.INPUT_TYPE_NUMBERS);
 }else if((_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4).equals("PHONE")) { 
 //BA.debugLineNum = 236;BA.debugLine="MyTextBoxB4X.InputType = MyTextBoxB4X.INPUT_TYPE";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setInputType(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.INPUT_TYPE_PHONE);
 }else if((_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4).equals("NONE")) { 
 //BA.debugLineNum = 238;BA.debugLine="MyTextBoxB4X.InputType=MyTextBoxB4X.INPUT_TYPE_N";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setInputType(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.INPUT_TYPE_NONE);
 }else if((_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4).equals("DECIMAL_NUMBERS")) { 
 //BA.debugLineNum = 240;BA.debugLine="MyTextBoxB4X.InputType=MyTextBoxB4X.INPUT_TYPE_D";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setInputType(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.INPUT_TYPE_DECIMAL_NUMBERS);
 };
 //BA.debugLineNum = 243;BA.debugLine="If PasswordMode=True Then MyTextBoxB4X.InputType";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1==__c.True) { 
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setInputType(__c.Bit.Or(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getInputType(),((int)0x00000080)));};
 //BA.debugLineNum = 245;BA.debugLine="If PasswordMode=True And TextboxInput=\"NUMBERS\" O";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1==__c.True && (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4).equals("NUMBERS") || (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4).equals("DECIMAL_NUMBERS")) { 
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setInputType(((int)0x00000012));};
 //BA.debugLineNum = 247;BA.debugLine="mBase.AddView(MyPanel, 0,8dip, mBase.Width, mBase";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getObject()),(int) (0),__c.DipToCurrent((int) (8)),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getWidth(),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight()-__c.DipToCurrent((int) (8))));
 //BA.debugLineNum = 248;BA.debugLine="MyPanel.AddView(MyTextBox, MyPanel.left+58dip,0,";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getObject()),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getLeft()+__c.DipToCurrent((int) (58))),(int) (0),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getWidth()-__c.DipToCurrent((int) (75))),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight()-__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 249;BA.debugLine="MyPanel.AddView(MyDikeyCizgiLabel, Myimageview.le";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getObject()),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getLeft()+__c.DipToCurrent((int) (45))),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getTop()+__c.DipToCurrent((int) (13))),__c.DipToCurrent((int) (2)),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight()-__c.DipToCurrent((int) (25))));
 //BA.debugLineNum = 250;BA.debugLine="MyPanel.AddView(Myimageview, MyPanel.left+12dip,M";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getObject()),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getLeft()+__c.DipToCurrent((int) (12))),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getHeight()/(double)1.9),__c.DipToCurrent((int) (25)),__c.DipToCurrent((int) (25)));
 //BA.debugLineNum = 251;BA.debugLine="MyPanel.AddView(TextboxOkeyButton, MyTextBox.Widt";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getObject()),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getWidth()+__c.DipToCurrent((int) (51))),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getHeight()/(double)2.2),__c.DipToCurrent((int) (30)),__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 254;BA.debugLine="TextboxOkeyButton.Gravity=Gravity.CENTER_VERTICAL";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 255;BA.debugLine="If DoneButton=True Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5==__c.True) { 
 //BA.debugLineNum = 256;BA.debugLine="TextboxOkeyButton.Typeface=Typeface.MATERIALICON";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setTypeface(__c.Typeface.getMATERIALICONS());
 //BA.debugLineNum = 257;BA.debugLine="TextboxOkeyButton.TextColor=DoneButtonColor";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setTextColor(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
 //BA.debugLineNum = 258;BA.debugLine="TextboxOkeyButton.TextSize=16";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setTextSize((float) (16));
 }else {
 //BA.debugLineNum = 260;BA.debugLine="TextboxOkeyButton.TextColor=Colors.Transparent";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setTextColor(__c.Colors.Transparent);
 };
 //BA.debugLineNum = 264;BA.debugLine="NormalLeft=MyPanel.Left";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getLeft();
 //BA.debugLineNum = 265;BA.debugLine="MyHintLabel.TextSize=14";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setTextSize((float) (14));
 //BA.debugLineNum = 266;BA.debugLine="MyHintLabel.TextColor=HintLabelColor";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setTextColor(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4);
 //BA.debugLineNum = 267;BA.debugLine="MyHLabel.Gravity=Gravity.LEFT";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 268;BA.debugLine="Dim HintYukseklik As Int=DipToCurrent(MyHintLabel";
_hintyukseklik = __c.DipToCurrent((int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getTextSize()/(double)0.77));
 //BA.debugLineNum = 271;BA.debugLine="If HintName.Length<=3 Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.length()<=3) { 
 //BA.debugLineNum = 272;BA.debugLine="Dim Sizex As Int=Abs(HintName.Length-4)";
_sizex = (int) (__c.Abs(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.length()-4));
 //BA.debugLineNum = 274;BA.debugLine="For i=0 To Sizex  -1";
{
final int step94 = 1;
final int limit94 = (int) (_sizex-1);
_i = (int) (0) ;
for (;_i <= limit94 ;_i = _i + step94 ) {
 //BA.debugLineNum = 275;BA.debugLine="HintName=HintName &\" \"";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0+" ";
 }
};
 };
 //BA.debugLineNum = 279;BA.debugLine="If HintNameUpText.Length<=3 Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.length()<=3) { 
 //BA.debugLineNum = 280;BA.debugLine="Dim Sizex As Int=Abs(HintNameUpText.Length-4)";
_sizex = (int) (__c.Abs(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.length()-4));
 //BA.debugLineNum = 281;BA.debugLine="For i=0 To Sizex  -1";
{
final int step100 = 1;
final int limit100 = (int) (_sizex-1);
_i = (int) (0) ;
for (;_i <= limit100 ;_i = _i + step100 ) {
 //BA.debugLineNum = 282;BA.debugLine="HintNameUpText=HintNameUpText &\" \"";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4+" ";
 }
};
 };
 //BA.debugLineNum = 287;BA.debugLine="MyHintLabel.Text=HintName";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setText(BA.ObjectToCharSequence(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0));
 //BA.debugLineNum = 288;BA.debugLine="NormalHintArkaPlanUzunlugu=UzunlukHesapla(HintNam";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 289;BA.debugLine="YukardaHintArkaPlanUzunlugu=UzunlukHesapla(HintNa";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4);
 //BA.debugLineNum = 290;BA.debugLine="mBase.AddView(MyHintLabel, MyTextBox.Left,MyTextB";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getObject()),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getLeft(),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getHeight()/(double)2),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6),_hintyukseklik);
 //BA.debugLineNum = 359;BA.debugLine="End Sub";
return "";
}
public String  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 514;BA.debugLine="Public Sub getHint As String";
 //BA.debugLineNum = 515;BA.debugLine="Return MyHintLabel.Text";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getText();
 //BA.debugLineNum = 516;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.EditTextWrapper  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4() throws Exception{
 //BA.debugLineNum = 456;BA.debugLine="Public Sub getNativeObject As EditText";
 //BA.debugLineNum = 457;BA.debugLine="Return MyTextBox";
if (true) return (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getObject()));
 //BA.debugLineNum = 458;BA.debugLine="End Sub";
return null;
}
public String  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0() throws Exception{
 //BA.debugLineNum = 524;BA.debugLine="Public Sub getText As String";
 //BA.debugLineNum = 525;BA.debugLine="Return MyTextBox.Text";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getText();
 //BA.debugLineNum = 526;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5() throws Exception{
 //BA.debugLineNum = 532;BA.debugLine="Public Sub getTextFont As B4XFont";
 //BA.debugLineNum = 533;BA.debugLine="Return MyTextBox.Font";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getFont();
 //BA.debugLineNum = 534;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _vcallback,String _veventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 112;BA.debugLine="Public Sub Initialize (vCallback As Object, vEvent";
 //BA.debugLineNum = 113;BA.debugLine="mEventName = vEventName";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _veventname;
 //BA.debugLineNum = 114;BA.debugLine="mCallBack = vCallback";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _vcallback;
 //BA.debugLineNum = 117;BA.debugLine="MyTextBoxB4X.Initialize(\"MyTextBox\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Initialize(ba,"MyTextBox");
 //BA.debugLineNum = 118;BA.debugLine="MyTextBoxB4X.InputType = Bit.Or(MyTextBoxB4X.Inpu";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setInputType(__c.Bit.Or(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getInputType(),(int) (524288)));
 //BA.debugLineNum = 119;BA.debugLine="IME.Initialize(\"\")";
_vvvvvvvvv5.Initialize("");
 //BA.debugLineNum = 125;BA.debugLine="MyHLabel.Initialize(\"LabelHint\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Initialize(ba,"LabelHint");
 //BA.debugLineNum = 126;BA.debugLine="MyHintLabel=MyHLabel";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getObject()));
 //BA.debugLineNum = 128;BA.debugLine="MyTextBox=MyTextBoxB4X";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getObject()));
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return "";
}
public String  _labelex_click() throws Exception{
 //BA.debugLineNum = 536;BA.debugLine="Private Sub Labelex_Click";
 //BA.debugLineNum = 537;BA.debugLine="If DoneButton=True And DoneButtonKeyboardHide=Tru";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5==__c.True && _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6==__c.True) { 
 //BA.debugLineNum = 539;BA.debugLine="IME.HideKeyboard";
_vvvvvvvvv5.HideKeyboard(ba);
 };
 //BA.debugLineNum = 545;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_DoneCli";
if (_vvvvv0.SubExists(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_DoneClick",(int) (0))) { 
__c.CallSubNew(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_DoneClick");};
 //BA.debugLineNum = 546;BA.debugLine="End Sub";
return "";
}
public String  _my_initialize() throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Private Sub My_initialize";
 //BA.debugLineNum = 133;BA.debugLine="MyPanel.Initialize(\"\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Initialize(ba,"");
 //BA.debugLineNum = 134;BA.debugLine="Myimageview.Initialize(\"\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.Initialize(ba,"");
 //BA.debugLineNum = 135;BA.debugLine="MyDikeyCizgiLabel.Initialize(\"\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.Initialize(ba,"");
 //BA.debugLineNum = 136;BA.debugLine="MyHintPanel.Initialize(\"\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Initialize(ba,"");
 //BA.debugLineNum = 138;BA.debugLine="TextboxOkeyButton.Initialize(\"Labelex\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Initialize(ba,"Labelex");
 //BA.debugLineNum = 139;BA.debugLine="mProps.Initialize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Initialize();
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public String  _mytextbox_action() throws Exception{
 //BA.debugLineNum = 628;BA.debugLine="Private Sub MyTextBox_Action";
 //BA.debugLineNum = 629;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_EnterPr";
if (_vvvvv0.SubExists(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_EnterPressed",(int) (0))) { 
__c.CallSubNew(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_EnterPressed");};
 //BA.debugLineNum = 630;BA.debugLine="End Sub";
return "";
}
public String  _mytextbox_beginedit() throws Exception{
 //BA.debugLineNum = 548;BA.debugLine="Private Sub MyTextBox_BeginEdit";
 //BA.debugLineNum = 549;BA.debugLine="CallSub2(Me,\"MyTextBox_FocusChanged\",True)";
__c.CallSubNew2(ba,this,"MyTextBox_FocusChanged",(Object)(__c.True));
 //BA.debugLineNum = 550;BA.debugLine="End Sub";
return "";
}
public String  _mytextbox_endedit() throws Exception{
 //BA.debugLineNum = 551;BA.debugLine="Private Sub MyTextBox_EndEdit";
 //BA.debugLineNum = 552;BA.debugLine="CallSub2(Me,\"MyTextBox_FocusChanged\",False)";
__c.CallSubNew2(ba,this,"MyTextBox_FocusChanged",(Object)(__c.False));
 //BA.debugLineNum = 553;BA.debugLine="End Sub";
return "";
}
public String  _mytextbox_enterpressed() throws Exception{
 //BA.debugLineNum = 621;BA.debugLine="private Sub MyTextBox_EnterPressed";
 //BA.debugLineNum = 625;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_EnterPr";
if (_vvvvv0.SubExists(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_EnterPressed",(int) (0))) { 
__c.CallSubNew(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_EnterPressed");};
 //BA.debugLineNum = 626;BA.debugLine="End Sub";
return "";
}
public String  _mytextbox_focuschanged(boolean _hasfocus) throws Exception{
 //BA.debugLineNum = 555;BA.debugLine="Private Sub MyTextBox_FocusChanged (HasFocus As Bo";
 //BA.debugLineNum = 556;BA.debugLine="If HasFocus = False Then";
if (_hasfocus==__c.False) { 
 //BA.debugLineNum = 557;BA.debugLine="If MyTextBox.Text.Length=0 Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getText().length()==0) { 
 //BA.debugLineNum = 559;BA.debugLine="If HintUpEnable = True Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2==__c.True) { 
 //BA.debugLineNum = 560;BA.debugLine="MyHintLabel.Width=NormalHintArkaPlanUzunlugu";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setWidth((int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6));
 //BA.debugLineNum = 561;BA.debugLine="MyHintLabel.Text=HintName";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setText(BA.ObjectToCharSequence(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0));
 //BA.debugLineNum = 562;BA.debugLine="MyHintLabel.TextColor=HintLabelColor";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setTextColor(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4);
 };
 //BA.debugLineNum = 564;BA.debugLine="TextboxOkeyButton.Visible=False";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setVisible(__c.False);
 //BA.debugLineNum = 566;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.SetLayoutAnimated((int) (200),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getLeft(),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getHeight()/(double)2),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getWidth(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getHeight());
 }else if(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getText().length()>0) { 
 //BA.debugLineNum = 572;BA.debugLine="If HintUpEnable = True Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2==__c.True) { 
 //BA.debugLineNum = 573;BA.debugLine="MyHintLabel.Width=YukardaHintArkaPlanUzunlugu";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setWidth((int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7));
 //BA.debugLineNum = 574;BA.debugLine="MyHintLabel.Text=HintNameUpText";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setText(BA.ObjectToCharSequence(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4));
 //BA.debugLineNum = 575;BA.debugLine="MyHintLabel.TextColor=HintNameUpColor";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setTextColor(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
 };
 //BA.debugLineNum = 577;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.SetLayoutAnimated((int) (200),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getLeft(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getTop(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getWidth(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getHeight());
 //BA.debugLineNum = 578;BA.debugLine="TextboxOkeyButton.Visible=False";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setVisible(__c.False);
 };
 }else {
 //BA.debugLineNum = 581;BA.debugLine="If MyTextBox.Text.Length=0 Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getText().length()==0) { 
 //BA.debugLineNum = 583;BA.debugLine="If HintUpEnable = True Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2==__c.True) { 
 //BA.debugLineNum = 584;BA.debugLine="MyHintLabel.Width=YukardaHintArkaPlanUzunlugu";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setWidth((int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7));
 //BA.debugLineNum = 585;BA.debugLine="MyHintLabel.Text=HintNameUpText";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setText(BA.ObjectToCharSequence(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4));
 //BA.debugLineNum = 586;BA.debugLine="MyHintLabel.TextColor=HintNameUpColor";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setTextColor(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
 };
 //BA.debugLineNum = 588;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.SetLayoutAnimated((int) (200),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getLeft(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getTop(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getWidth(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getHeight());
 //BA.debugLineNum = 591;BA.debugLine="TextboxOkeyButton.Text=\"\"";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 592;BA.debugLine="TextboxOkeyButton.Visible=True";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setVisible(__c.True);
 }else {
 //BA.debugLineNum = 594;BA.debugLine="TextboxOkeyButton.Text=\"\"";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 595;BA.debugLine="TextboxOkeyButton.Visible=True";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setVisible(__c.True);
 };
 };
 //BA.debugLineNum = 600;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_FocusCh";
if (_vvvvv0.SubExists(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_FocusChanged",(int) (1))) { 
__c.CallSubNew2(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_FocusChanged",(Object)(_hasfocus));};
 //BA.debugLineNum = 601;BA.debugLine="End Sub";
return "";
}
public String  _mytextbox_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 605;BA.debugLine="Private Sub MyTextBox_TextChanged (Old As String,";
 //BA.debugLineNum = 607;BA.debugLine="If New.Length>Old.Length Then";
if (_new.length()>_old.length()) { 
 //BA.debugLineNum = 609;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.le";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.SetLayoutAnimated((int) (200),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getLeft(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getTop(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getWidth(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getHeight());
 };
 //BA.debugLineNum = 618;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_TextCha";
if (_vvvvv0.SubExists(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_TextChanged",(int) (2))) { 
__c.CallSubNew3(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_TextChanged",(Object)(_old),(Object)(_new));};
 //BA.debugLineNum = 619;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(String _hintstring) throws Exception{
 //BA.debugLineNum = 518;BA.debugLine="Public Sub setHint(HintString As String) As String";
 //BA.debugLineNum = 519;BA.debugLine="NormalHintArkaPlanUzunlugu=UzunlukHesapla(HintStr";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(_hintstring);
 //BA.debugLineNum = 520;BA.debugLine="MyHintLabel.Text = HintString";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setText(BA.ObjectToCharSequence(_hintstring));
 //BA.debugLineNum = 521;BA.debugLine="MyHintLabel.Width = NormalHintArkaPlanUzunlugu";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setWidth((int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6));
 //BA.debugLineNum = 522;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(String _text) throws Exception{
 //BA.debugLineNum = 465;BA.debugLine="Public Sub setText(Text As String)";
 //BA.debugLineNum = 466;BA.debugLine="If ilkAcilis=True Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0==__c.True) { 
 //BA.debugLineNum = 468;BA.debugLine="If HintUpEnable = True Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2==__c.True) { 
 //BA.debugLineNum = 469;BA.debugLine="MyHintLabel.Width=YukardaHintArkaPlanUzunlugu";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setWidth((int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7));
 //BA.debugLineNum = 470;BA.debugLine="MyHintLabel.Text=HintNameUpText";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setText(BA.ObjectToCharSequence(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4));
 //BA.debugLineNum = 471;BA.debugLine="MyHintLabel.TextColor=HintNameUpColor";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setTextColor(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
 };
 //BA.debugLineNum = 473;BA.debugLine="If Text.Length=0 Then";
if (_text.length()==0) { 
 //BA.debugLineNum = 475;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.SetLayoutAnimated((int) (200),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getLeft(),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getHeight()/(double)2),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getWidth(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getHeight());
 }else {
 //BA.debugLineNum = 480;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.SetLayoutAnimated((int) (200),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getLeft(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getTop(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getWidth(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getHeight());
 };
 };
 //BA.debugLineNum = 483;BA.debugLine="MyTextBox.Text=Text";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 487;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt) throws Exception{
 //BA.debugLineNum = 528;BA.debugLine="Public Sub setTextFont(Fnt As B4XFont)";
 //BA.debugLineNum = 529;BA.debugLine="MyTextBox.Font=Fnt";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setFont(_fnt);
 //BA.debugLineNum = 530;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(String _errortext) throws Exception{
anywheresoftware.b4a.objects.drawable.ColorDrawable _panelarkaplanozellikleri = null;
 //BA.debugLineNum = 389;BA.debugLine="Public Sub ShowError(ErrorText As String)";
 //BA.debugLineNum = 390;BA.debugLine="Myimageview.Bitmap=LoadBitmap(File.DirAssets,Erro";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setBitmap((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0).getObject()));
 //BA.debugLineNum = 393;BA.debugLine="If ErrorText.Length>0 Then";
if (_errortext.length()>0) { 
 //BA.debugLineNum = 394;BA.debugLine="ToastMessageShow(ErrorText,False)";
__c.ToastMessageShow(BA.ObjectToCharSequence(_errortext),__c.False);
 };
 //BA.debugLineNum = 396;BA.debugLine="Dim PanelArkaPlanOzellikleri As ColorDrawable";
_panelarkaplanozellikleri = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 397;BA.debugLine="PanelArkaPlanOzellikleri.Initialize2(ArkaPlanReng";
_panelarkaplanozellikleri.Initialize2(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
 //BA.debugLineNum = 398;BA.debugLine="MyPanel.Background=PanelArkaPlanOzellikleri";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setBackground((android.graphics.drawable.Drawable)(_panelarkaplanozellikleri.getObject()));
 //BA.debugLineNum = 405;BA.debugLine="End Sub";
return "";
}
public void  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(String _errortext) throws Exception{
ResumableSub_ShowErrorAnimation rsub = new ResumableSub_ShowErrorAnimation(this,_errortext);
rsub.resume(ba, null);
}
public static class ResumableSub_ShowErrorAnimation extends BA.ResumableSub {
public ResumableSub_ShowErrorAnimation(cm.jahswant.foodhunter.metroui_textview parent,String _errortext) {
this.parent = parent;
this._errortext = _errortext;
}
cm.jahswant.foodhunter.metroui_textview parent;
String _errortext;
anywheresoftware.b4a.objects.drawable.ColorDrawable _panelarkaplanozellikleri = null;
int _i = 0;
int step9;
int limit9;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 426;BA.debugLine="Myimageview.Bitmap=LoadBitmap(File.DirAssets,Erro";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setBitmap((android.graphics.Bitmap)(parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0).getObject()));
 //BA.debugLineNum = 428;BA.debugLine="If ErrorText.Length>0 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_errortext.length()>0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 429;BA.debugLine="ToastMessageShow(ErrorText,False)";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence(_errortext),parent.__c.False);
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 431;BA.debugLine="Dim PanelArkaPlanOzellikleri As ColorDrawable";
_panelarkaplanozellikleri = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 432;BA.debugLine="PanelArkaPlanOzellikleri.Initialize2(ArkaPlanReng";
_panelarkaplanozellikleri.Initialize2(parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2,parent.__c.Colors.Red);
 //BA.debugLineNum = 433;BA.debugLine="MyPanel.Background=PanelArkaPlanOzellikleri";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setBackground((android.graphics.drawable.Drawable)(_panelarkaplanozellikleri.getObject()));
 //BA.debugLineNum = 434;BA.debugLine="MyHintLabel.Visible=False";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setVisible(parent.__c.False);
 //BA.debugLineNum = 443;BA.debugLine="For i=0 To 2";
if (true) break;

case 5:
//for
this.state = 8;
step9 = 1;
limit9 = (int) (2);
_i = (int) (0) ;
this.state = 9;
if (true) break;

case 9:
//C
this.state = 8;
if ((step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9)) this.state = 7;
if (true) break;

case 10:
//C
this.state = 9;
_i = ((int)(0 + _i + step9)) ;
if (true) break;

case 7:
//C
this.state = 10;
 //BA.debugLineNum = 444;BA.debugLine="MyPanel.Left=NormalLeft+100dip";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setLeft((int) (parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5+parent.__c.DipToCurrent((int) (100))));
 //BA.debugLineNum = 446;BA.debugLine="Sleep(50)";
parent.__c.Sleep(ba,this,(int) (50));
this.state = 11;
return;
case 11:
//C
this.state = 10;
;
 //BA.debugLineNum = 448;BA.debugLine="MyPanel.Left=NormalLeft-100dip";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setLeft((int) (parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5-parent.__c.DipToCurrent((int) (100))));
 //BA.debugLineNum = 449;BA.debugLine="Sleep(50)";
parent.__c.Sleep(ba,this,(int) (50));
this.state = 12;
return;
case 12:
//C
this.state = 10;
;
 if (true) break;
if (true) break;

case 8:
//C
this.state = -1;
;
 //BA.debugLineNum = 451;BA.debugLine="MyHintLabel.Visible=True";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setVisible(parent.__c.True);
 //BA.debugLineNum = 452;BA.debugLine="MyPanel.Left=NormalLeft";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setLeft(parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5);
 //BA.debugLineNum = 453;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(String _warningtext) throws Exception{
anywheresoftware.b4a.objects.drawable.ColorDrawable _panelarkaplanozellikleri = null;
 //BA.debugLineNum = 407;BA.debugLine="Public Sub ShowWarning(WarningText As String)";
 //BA.debugLineNum = 408;BA.debugLine="Myimageview.Bitmap=LoadBitmap(File.DirAssets,Warn";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setBitmap((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1).getObject()));
 //BA.debugLineNum = 410;BA.debugLine="If WarningText.Length>0 Then";
if (_warningtext.length()>0) { 
 //BA.debugLineNum = 411;BA.debugLine="ToastMessageShow(WarningText,False)";
__c.ToastMessageShow(BA.ObjectToCharSequence(_warningtext),__c.False);
 };
 //BA.debugLineNum = 413;BA.debugLine="Dim PanelArkaPlanOzellikleri As ColorDrawable";
_panelarkaplanozellikleri = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 414;BA.debugLine="PanelArkaPlanOzellikleri.Initialize2(ArkaPlanReng";
_panelarkaplanozellikleri.Initialize2(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2,__c.Colors.RGB((int) (193),(int) (200),(int) (24)));
 //BA.debugLineNum = 415;BA.debugLine="MyPanel.Background=PanelArkaPlanOzellikleri";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setBackground((android.graphics.drawable.Drawable)(_panelarkaplanozellikleri.getObject()));
 //BA.debugLineNum = 422;BA.debugLine="End Sub";
return "";
}
public double  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(String _nametext) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _uzunpanel = null;
anywheresoftware.b4a.objects.B4XCanvas _canvas1 = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rect = null;
double _sonuc = 0;
 //BA.debugLineNum = 376;BA.debugLine="Private Sub UzunlukHesapla (NameText As String) As";
 //BA.debugLineNum = 377;BA.debugLine="Dim UzunPanel As B4XView = xui.CreatePanel(\"\")";
_uzunpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_uzunpanel = _vvvvv0.CreatePanel(ba,"");
 //BA.debugLineNum = 378;BA.debugLine="UzunPanel.SetLayoutAnimated(0,0,0,MyPanel.Width,M";
_uzunpanel.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getWidth(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight());
 //BA.debugLineNum = 379;BA.debugLine="Dim Canvas1 As B4XCanvas";
_canvas1 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 380;BA.debugLine="Canvas1.Initialize(UzunPanel)";
_canvas1.Initialize(_uzunpanel);
 //BA.debugLineNum = 381;BA.debugLine="Dim Rect As B4XRect = Canvas1.MeasureText(NameTex";
_rect = _canvas1.MeasureText(_nametext,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getFont());
 //BA.debugLineNum = 382;BA.debugLine="Dim Sonuc As Double=(Rect.Width*1.08)";
_sonuc = (_rect.getWidth()*1.08);
 //BA.debugLineNum = 386;BA.debugLine="Return Sonuc";
if (true) return _sonuc;
 //BA.debugLineNum = 387;BA.debugLine="End Sub";
return 0;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "MYTEXTBOX_FOCUSCHANGED"))
	return _mytextbox_focuschanged((Boolean) args[0]);
return BA.SubDelegator.SubNotFound;
}
}

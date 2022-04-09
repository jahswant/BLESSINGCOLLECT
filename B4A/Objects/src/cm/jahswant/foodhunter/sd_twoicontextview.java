package cm.jahswant.foodhunter;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class sd_twoicontextview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "cm.jahswant.foodhunter.sd_twoicontextview");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", cm.jahswant.foodhunter.sd_twoicontextview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = "";
public Object _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvv0 = null;
public Object _vvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public anywheresoftware.b4a.objects.B4XCanvas _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = "";
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = false;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
public b4a.example.dateutils _vvvvvv0 = null;
public cm.jahswant.foodhunter.main _vvvvvvv1 = null;
public cm.jahswant.foodhunter.utils _vvvvvvv2 = null;
public cm.jahswant.foodhunter.starter _vvvvvvv3 = null;
public cm.jahswant.foodhunter.b4xpages _vvvvvvv4 = null;
public cm.jahswant.foodhunter.b4xcollections _vvvvvvv5 = null;
public cm.jahswant.foodhunter.httputils2service _vvvvvvv6 = null;
public cm.jahswant.foodhunter.xuiviewsutils _vvvvvvv7 = null;
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2() throws Exception{
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rec = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _path = null;
 //BA.debugLineNum = 273;BA.debugLine="Private Sub Background";
 //BA.debugLineNum = 274;BA.debugLine="Dim Rec As B4XRect";
_rec = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 276;BA.debugLine="Rec.Initialize(20dip,mBase.Height/2,mBase.Width-2";
_rec.Initialize((float) (__c.DipToCurrent((int) (20))),(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight()/(double)2),(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getWidth()-__c.DipToCurrent((int) (20))),(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight()));
 //BA.debugLineNum = 277;BA.debugLine="Can.DrawRect(Rec,CornerColor,True,0dip)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.DrawRect(_rec,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,__c.True,(float) (__c.DipToCurrent((int) (0))));
 //BA.debugLineNum = 279;BA.debugLine="Dim Rec As B4XRect";
_rec = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 280;BA.debugLine="Rec.Initialize(45dip,0dip,mBase.Width-45dip,mBase";
_rec.Initialize((float) (__c.DipToCurrent((int) (45))),(float) (__c.DipToCurrent((int) (0))),(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getWidth()-__c.DipToCurrent((int) (45))),(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight()-__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 281;BA.debugLine="Dim Path As B4XPath";
_path = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
 //BA.debugLineNum = 282;BA.debugLine="Path.InitializeRoundedRect(Rec,20dip)";
_path.InitializeRoundedRect(_rec,(float) (__c.DipToCurrent((int) (20))));
 //BA.debugLineNum = 283;BA.debugLine="Can.DrawPath(Path,BClr,True,0dip)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.DrawPath(_path,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6,__c.True,(float) (__c.DipToCurrent((int) (0))));
 //BA.debugLineNum = 284;BA.debugLine="Can.Invalidate";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Invalidate();
 //BA.debugLineNum = 285;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 155;BA.debugLine="If RTL Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5) { 
 //BA.debugLineNum = 156;BA.debugLine="MyEditText.Width=Width-LenEditText";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setWidth((int) (_width-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5));
 //BA.debugLineNum = 157;BA.debugLine="MyEditText.Height=Height";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setHeight((int) (_height));
 //BA.debugLineNum = 158;BA.debugLine="LabelHint.Left=Width-45dip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setLeft((int) (_width-__c.DipToCurrent((int) (45))));
 //BA.debugLineNum = 159;BA.debugLine="LabelHint.Height=Height";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setHeight((int) (_height));
 //BA.debugLineNum = 160;BA.debugLine="LabelSend.Height=Height";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.setHeight((int) (_height));
 }else {
 //BA.debugLineNum = 162;BA.debugLine="MyEditText.Width=Width-LenEditText";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setWidth((int) (_width-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5));
 //BA.debugLineNum = 163;BA.debugLine="MyEditText.Height=Height";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setHeight((int) (_height));
 //BA.debugLineNum = 164;BA.debugLine="LabelHint.Height=Height";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setHeight((int) (_height));
 //BA.debugLineNum = 165;BA.debugLine="LabelSend.Left=Width-45dip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.setLeft((int) (_width-__c.DipToCurrent((int) (45))));
 //BA.debugLineNum = 166;BA.debugLine="LabelSend.Height=Height";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.setHeight((int) (_height));
 };
 //BA.debugLineNum = 169;BA.debugLine="mBase.Width=Width";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setWidth((int) (_width));
 //BA.debugLineNum = 170;BA.debugLine="mBase.Height=Height";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setHeight((int) (_height));
 //BA.debugLineNum = 171;BA.debugLine="If Style=\"Bead\" Then";
if ((_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7).equals("Bead")) { 
 //BA.debugLineNum = 172;BA.debugLine="Background";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
 };
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = "";
 //BA.debugLineNum = 17;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new Object();
 //BA.debugLineNum = 18;BA.debugLine="Public mBase As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private xui As XUI 'ignore";
_vvvvv0 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 20;BA.debugLine="Public Tag As Object";
_vvvvvvvvvvvvvvvvvvvvvvvvv7 = new Object();
 //BA.debugLineNum = 22;BA.debugLine="Dim Can As B4XCanvas";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 24;BA.debugLine="Private Corner As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
 //BA.debugLineNum = 25;BA.debugLine="Private CornerColor As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
 //BA.debugLineNum = 26;BA.debugLine="Private Textcolor As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
 //BA.debugLineNum = 27;BA.debugLine="Private Style As String = \"Frame\"";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = "Frame";
 //BA.debugLineNum = 28;BA.debugLine="Private LenEditText As Int = 50dip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = __c.DipToCurrent((int) (50));
 //BA.debugLineNum = 29;BA.debugLine="Private BClr As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
 //BA.debugLineNum = 30;BA.debugLine="Private RTL As Boolean = False";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = __c.False;
 //BA.debugLineNum = 31;BA.debugLine="Private LabelHint As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private MyEditText As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private LabelSend As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _lbx = null;
anywheresoftware.b4a.objects.EditTextWrapper _ed = null;
anywheresoftware.b4j.object.JavaObject _tf = null;
 //BA.debugLineNum = 50;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 51;BA.debugLine="mBase = Base";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 52;BA.debugLine="Tag = mBase.Tag";
_vvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getTag();
 //BA.debugLineNum = 53;BA.debugLine="mBase.Tag = Me";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setTag(this);
 //BA.debugLineNum = 54;BA.debugLine="Dim lbx As B4XView = Lbl";
_lbx = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbx = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 57;BA.debugLine="Dim ED As EditText";
_ed = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 58;BA.debugLine="ED.Initialize(\"MyEditText\")";
_ed.Initialize(ba,"MyEditText");
 //BA.debugLineNum = 59;BA.debugLine="If Props.ContainsKey(\"Password\") Then";
if (_props.ContainsKey((Object)("Password"))) { 
 //BA.debugLineNum = 60;BA.debugLine="If Props.Get(\"Password\").As(Boolean) Then ED.In";
if ((BA.ObjectToBoolean(_props.Get((Object)("Password"))))) { 
_ed.setInputType(__c.Bit.Or(_ed.getInputType(),((int)0x00000080)));};
 };
 //BA.debugLineNum = 78;BA.debugLine="MyEditText=ED";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_ed.getObject()));
 //BA.debugLineNum = 80;BA.debugLine="Textcolor=lbx.Textcolor";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _lbx.getTextColor();
 //BA.debugLineNum = 82;BA.debugLine="If Props.ContainsKey(\"RTL\") Then RTL=Props.Get(\"R";
if (_props.ContainsKey((Object)("RTL"))) { 
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = BA.ObjectToBoolean(_props.Get((Object)("RTL")));};
 //BA.debugLineNum = 83;BA.debugLine="If Props.ContainsKey(\"Style\") Then Style=Props.Ge";
if (_props.ContainsKey((Object)("Style"))) { 
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = BA.ObjectToString(_props.Get((Object)("Style")));};
 //BA.debugLineNum = 84;BA.debugLine="If Props.ContainsKey(\"CornerColor\") Then CornerCo";
if (_props.ContainsKey((Object)("CornerColor"))) { 
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _vvvvv0.PaintOrColorToColor(_props.Get((Object)("CornerColor")));}
else {
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _lbx.getTextColor();};
 //BA.debugLineNum = 85;BA.debugLine="If Props.ContainsKey(\"Background\") Then	BClr=xui.";
if (_props.ContainsKey((Object)("Background"))) { 
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvvvv0.PaintOrColorToColor(_props.Get((Object)("Background")));}
else {
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getColor();};
 //BA.debugLineNum = 86;BA.debugLine="Corner=Props.Get(\"Corner\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = (int)(BA.ObjectToNumber(_props.Get((Object)("Corner"))));
 //BA.debugLineNum = 87;BA.debugLine="Corner=Corner*(100dip/100)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3*(__c.DipToCurrent((int) (100))/(double)100));
 //BA.debugLineNum = 94;BA.debugLine="MyEditText.Text=lbx.Text";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setText(BA.ObjectToCharSequence(_lbx.getText()));
 //BA.debugLineNum = 95;BA.debugLine="MyEditText.TextColor=Textcolor";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setTextColor(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
 //BA.debugLineNum = 96;BA.debugLine="MyEditText.TextSize=lbx.TextSize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setTextSize(_lbx.getTextSize());
 //BA.debugLineNum = 97;BA.debugLine="MyEditText.Font=lbx.Font";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setFont(_lbx.getFont());
 //BA.debugLineNum = 98;BA.debugLine="MyEditText.Color=xui.Color_Transparent";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setColor(_vvvvv0.Color_Transparent);
 //BA.debugLineNum = 100;BA.debugLine="LabelHint.Text=Chr(0xF183)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setText(BA.ObjectToCharSequence(__c.Chr(((int)0xf183))));
 //BA.debugLineNum = 101;BA.debugLine="LabelHint.TextColor=Textcolor";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setTextColor(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
 //BA.debugLineNum = 102;BA.debugLine="LabelHint.Color=xui.Color_Transparent";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setColor(_vvvvv0.Color_Transparent);
 //BA.debugLineNum = 103;BA.debugLine="LabelHint.SetTextAlignment(\"CENTER\",\"CENTER\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 104;BA.debugLine="LabelHint.Font=xui.CreateFontAwesome(MyEditText.F";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setFont(_vvvvv0.CreateFontAwesome(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getFont().getSize()));
 //BA.debugLineNum = 106;BA.debugLine="LabelSend.Text=Chr(0xF00C)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.setText(BA.ObjectToCharSequence(__c.Chr(((int)0xf00c))));
 //BA.debugLineNum = 107;BA.debugLine="LabelSend.TextColor=Textcolor";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.setTextColor(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
 //BA.debugLineNum = 108;BA.debugLine="LabelSend.Color=xui.Color_Transparent";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.setColor(_vvvvv0.Color_Transparent);
 //BA.debugLineNum = 109;BA.debugLine="LabelSend.SetTextAlignment(\"CENTER\",\"CENTER\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 110;BA.debugLine="LabelSend.Font=xui.CreateFontAwesome(MyEditText.F";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.setFont(_vvvvv0.CreateFontAwesome(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getFont().getSize()));
 //BA.debugLineNum = 112;BA.debugLine="Select Style";
switch (BA.switchObjectToInt(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,"Frame","Bead")) {
case 0: {
 //BA.debugLineNum = 114;BA.debugLine="mBase.SetColorAndBorder(BClr,1dip,CornerColor,C";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.SetColorAndBorder(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6,__c.DipToCurrent((int) (1)),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
 break; }
case 1: {
 //BA.debugLineNum = 116;BA.debugLine="LenEditText=100dip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = __c.DipToCurrent((int) (100));
 //BA.debugLineNum = 117;BA.debugLine="LabelHint.TextColor=BClr";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setTextColor(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
 //BA.debugLineNum = 118;BA.debugLine="LabelHint.SetColorAndBorder(CornerColor,0dip,BC";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.SetColorAndBorder(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,__c.DipToCurrent((int) (0)),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6,__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 119;BA.debugLine="LabelSend.TextColor=BClr";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.setTextColor(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
 //BA.debugLineNum = 120;BA.debugLine="LabelSend.SetColorAndBorder(CornerColor,0dip,BC";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.SetColorAndBorder(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,__c.DipToCurrent((int) (0)),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6,__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 122;BA.debugLine="Can.Initialize(mBase)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Initialize(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5);
 //BA.debugLineNum = 123;BA.debugLine="Background";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
 break; }
}
;
 //BA.debugLineNum = 126;BA.debugLine="If RTL Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5) { 
 //BA.debugLineNum = 127;BA.debugLine="mBase.AddView(LabelHint,mBase.Width-45dip,0dip,4";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getObject()),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getWidth()-__c.DipToCurrent((int) (45))),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (40)),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight());
 //BA.debugLineNum = 128;BA.debugLine="mBase.AddView(MyEditText,50dip,0dip,mBase.Width-";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getObject()),__c.DipToCurrent((int) (50)),__c.DipToCurrent((int) (0)),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getWidth()-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight());
 //BA.debugLineNum = 129;BA.debugLine="mBase.AddView(LabelSend,5dip,0dip,40dip,mBase.He";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (40)),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight());
 //BA.debugLineNum = 137;BA.debugLine="MyEditText.SetTextAlignment(\"CENTER\",\"RIGHT\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.SetTextAlignment("CENTER","RIGHT");
 //BA.debugLineNum = 138;BA.debugLine="Dim TF = MyEditText As JavaObject";
_tf = new anywheresoftware.b4j.object.JavaObject();
_tf = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getObject()));
 //BA.debugLineNum = 139;BA.debugLine="TF.RunMethod(\"setPadding\", Array As Object(5dip";
_tf.RunMethod("setPadding",new Object[]{(Object)(__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (0))),(Object)(__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (0)))});
 }else {
 //BA.debugLineNum = 142;BA.debugLine="mBase.AddView(LabelHint,5dip,0dip,40dip,mBase.He";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (40)),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight());
 //BA.debugLineNum = 143;BA.debugLine="mBase.AddView(MyEditText,50dip,0dip,mBase.Width-";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getObject()),__c.DipToCurrent((int) (50)),__c.DipToCurrent((int) (0)),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getWidth()-__c.DipToCurrent((int) (150))),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight());
 //BA.debugLineNum = 144;BA.debugLine="mBase.AddView(LabelSend,mBase.Width-45dip,0dip,4";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getObject()),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getWidth()-__c.DipToCurrent((int) (45))),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (40)),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight());
 //BA.debugLineNum = 149;BA.debugLine="MyEditText.SetTextAlignment(\"CENTER\",\"LEFT\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.SetTextAlignment("CENTER","LEFT");
 };
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Public Sub GetBase As B4XView";
 //BA.debugLineNum = 177;BA.debugLine="Return mBase";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return null;
}
public String  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 194;BA.debugLine="Public Sub getHint As String";
 //BA.debugLineNum = 195;BA.debugLine="Return LabelHint.Text";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getText();
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0() throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Public Sub getHintFont As B4XFont";
 //BA.debugLineNum = 212;BA.debugLine="Return LabelHint.Font";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getFont();
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.EditTextWrapper  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4() throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Public Sub getNativeObject As EditText";
 //BA.debugLineNum = 182;BA.debugLine="Return MyEditText";
if (true) return (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getObject()));
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return null;
}
public String  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0() throws Exception{
 //BA.debugLineNum = 219;BA.debugLine="Public Sub getText As String";
 //BA.debugLineNum = 220;BA.debugLine="Return MyEditText.Text";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getText();
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return "";
}
public String  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1() throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Public Sub getTextConfirmButton As String";
 //BA.debugLineNum = 204;BA.debugLine="Return LabelSend.Text";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getText();
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5() throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="Public Sub getTextFont As B4XFont";
 //BA.debugLineNum = 228;BA.debugLine="Return MyEditText.Font";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getFont();
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4a.objects.LabelWrapper _lh = null;
anywheresoftware.b4a.objects.LabelWrapper _ls = null;
 //BA.debugLineNum = 36;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 37;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _eventname;
 //BA.debugLineNum = 38;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _callback;
 //BA.debugLineNum = 40;BA.debugLine="Dim LH As Label";
_lh = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 41;BA.debugLine="LH.Initialize(\"LabelHint\")";
_lh.Initialize(ba,"LabelHint");
 //BA.debugLineNum = 42;BA.debugLine="LabelHint=LH";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lh.getObject()));
 //BA.debugLineNum = 44;BA.debugLine="Dim LS As Label";
_ls = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 45;BA.debugLine="LS.Initialize(\"LabelSend\")";
_ls.Initialize(ba,"LabelSend");
 //BA.debugLineNum = 46;BA.debugLine="LabelSend=LS";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_ls.getObject()));
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public String  _labelhint_click() throws Exception{
 //BA.debugLineNum = 267;BA.debugLine="Private Sub LabelHint_Click";
 //BA.debugLineNum = 268;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_HintCli";
if (_vvvvv0.SubExists(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_HintClick",(int) (0))) { 
__c.CallSubNew(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_HintClick");};
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return "";
}
public String  _labelsend_click() throws Exception{
 //BA.debugLineNum = 261;BA.debugLine="Private Sub LabelSend_Click";
 //BA.debugLineNum = 262;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_Unfocus";
if (_vvvvv0.SubExists(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_Unfocus",(int) (0))) { 
__c.CallSubNew(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_Unfocus");};
 //BA.debugLineNum = 264;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_Click\",";
if (_vvvvv0.SubExists(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_Click",(int) (0))) { 
__c.CallSubNew(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_Click");};
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return "";
}
public String  _myedittext_action() throws Exception{
 //BA.debugLineNum = 257;BA.debugLine="Private Sub MyEditText_Action";
 //BA.debugLineNum = 258;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_EnterPr";
if (_vvvvv0.SubExists(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_EnterPressed",(int) (0))) { 
__c.CallSubNew(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_EnterPressed");};
 //BA.debugLineNum = 259;BA.debugLine="End Sub";
return "";
}
public String  _myedittext_beginedit() throws Exception{
 //BA.debugLineNum = 247;BA.debugLine="Private Sub MyEditText_BeginEdit";
 //BA.debugLineNum = 248;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_FocusCh";
if (_vvvvv0.SubExists(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_FocusChanged",(int) (1))) { 
__c.CallSubNew2(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_FocusChanged",(Object)(__c.True));};
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return "";
}
public String  _myedittext_endedit() throws Exception{
 //BA.debugLineNum = 251;BA.debugLine="Private Sub MyEdittext_EndEdit";
 //BA.debugLineNum = 252;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_Unfocus";
if (_vvvvv0.SubExists(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_Unfocus",(int) (0))) { 
__c.CallSubNew(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_Unfocus");};
 //BA.debugLineNum = 254;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_FocusCh";
if (_vvvvv0.SubExists(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_FocusChanged",(int) (1))) { 
__c.CallSubNew2(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_FocusChanged",(Object)(__c.False));};
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return "";
}
public String  _myedittext_enterpressed() throws Exception{
 //BA.debugLineNum = 237;BA.debugLine="private Sub MyEditText_EnterPressed";
 //BA.debugLineNum = 238;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_Unfocus";
if (_vvvvv0.SubExists(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_Unfocus",(int) (0))) { 
__c.CallSubNew(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_Unfocus");};
 //BA.debugLineNum = 240;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_EnterPr";
if (_vvvvv0.SubExists(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_EnterPressed",(int) (0))) { 
__c.CallSubNew(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_EnterPressed");};
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return "";
}
public String  _myedittext_focuschanged(boolean _hasfocus) throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="Private Sub MyEditText_FocusChanged (HasFocus As B";
 //BA.debugLineNum = 244;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_FocusCh";
if (_vvvvv0.SubExists(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_FocusChanged",(int) (1))) { 
__c.CallSubNew2(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_FocusChanged",(Object)(_hasfocus));};
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return "";
}
public String  _myedittext_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 233;BA.debugLine="Private Sub MyEditText_TextChanged (Old As String,";
 //BA.debugLineNum = 234;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_TextCha";
if (_vvvvv0.SubExists(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_TextChanged",(int) (2))) { 
__c.CallSubNew3(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_TextChanged",(Object)(_old),(Object)(_new));};
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(String _text) throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Public Sub setHint(Text As String)";
 //BA.debugLineNum = 191;BA.debugLine="LabelHint.Text=Text";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt) throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Public Sub setHintFont(Fnt As B4XFont)";
 //BA.debugLineNum = 208;BA.debugLine="LabelHint.Font=Fnt";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setFont(_fnt);
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(String _text) throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Public Sub setText(Text As String)";
 //BA.debugLineNum = 216;BA.debugLine="MyEditText.Text=Text";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(String _text) throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Public Sub setTextConfirmButton(Text As String)";
 //BA.debugLineNum = 200;BA.debugLine="LabelSend.Text=Text";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt) throws Exception{
 //BA.debugLineNum = 223;BA.debugLine="Public Sub setTextFont(Fnt As B4XFont)";
 //BA.debugLineNum = 224;BA.debugLine="MyEditText.Font=Fnt";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setFont(_fnt);
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}

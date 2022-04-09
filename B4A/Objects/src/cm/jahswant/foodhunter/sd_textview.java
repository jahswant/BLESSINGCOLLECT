package cm.jahswant.foodhunter;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class sd_textview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "cm.jahswant.foodhunter.sd_textview");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", cm.jahswant.foodhunter.sd_textview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = "";
public Object _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvv0 = null;
public Object _vvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = false;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = false;
public b4a.example.dateutils _vvvvvv0 = null;
public cm.jahswant.foodhunter.main _vvvvvvv1 = null;
public cm.jahswant.foodhunter.utils _vvvvvvv2 = null;
public cm.jahswant.foodhunter.starter _vvvvvvv3 = null;
public cm.jahswant.foodhunter.b4xpages _vvvvvvv4 = null;
public cm.jahswant.foodhunter.b4xcollections _vvvvvvv5 = null;
public cm.jahswant.foodhunter.httputils2service _vvvvvvv6 = null;
public cm.jahswant.foodhunter.xuiviewsutils _vvvvvvv7 = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 126;BA.debugLine="MyEditText.Width=Width-5dip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setWidth((int) (_width-__c.DipToCurrent((int) (5))));
 //BA.debugLineNum = 127;BA.debugLine="MyEditText.Height=Height-15dip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setHeight((int) (_height-__c.DipToCurrent((int) (15))));
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 14;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = "";
 //BA.debugLineNum = 15;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new Object();
 //BA.debugLineNum = 16;BA.debugLine="Public mBase As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private xui As XUI 'ignore";
_vvvvv0 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 18;BA.debugLine="Public Tag As Object";
_vvvvvvvvvvvvvvvvvvvvvvvvv7 = new Object();
 //BA.debugLineNum = 20;BA.debugLine="Private HintTextSize As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
 //BA.debugLineNum = 21;BA.debugLine="Private LabelHint As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private MyEditText As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private RTL As Boolean = False";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = __c.False;
 //BA.debugLineNum = 25;BA.debugLine="Private HintReduce As Boolean = True";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = __c.True;
 //BA.debugLineNum = 26;BA.debugLine="Private Animated As Boolean = True";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = __c.True;
 //BA.debugLineNum = 27;BA.debugLine="Private CornerColor As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
 //BA.debugLineNum = 28;BA.debugLine="Private Pss As Boolean = False";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = __c.False;
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _lbx = null;
anywheresoftware.b4a.objects.EditTextWrapper _ed = null;
 //BA.debugLineNum = 41;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 42;BA.debugLine="mBase = Base";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 43;BA.debugLine="Tag = mBase.Tag";
_vvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getTag();
 //BA.debugLineNum = 44;BA.debugLine="mBase.Tag = Me";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setTag(this);
 //BA.debugLineNum = 45;BA.debugLine="Dim lbx As B4XView = Lbl";
_lbx = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbx = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 48;BA.debugLine="Dim ED As EditText";
_ed = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 49;BA.debugLine="ED.Initialize(\"MyEditText\")";
_ed.Initialize(ba,"MyEditText");
 //BA.debugLineNum = 50;BA.debugLine="If Props.ContainsKey(\"Password\") Then";
if (_props.ContainsKey((Object)("Password"))) { 
 //BA.debugLineNum = 51;BA.debugLine="If Props.Get(\"Password\").As(Boolean) Then ED.In";
if ((BA.ObjectToBoolean(_props.Get((Object)("Password"))))) { 
_ed.setInputType(__c.Bit.Or(_ed.getInputType(),((int)0x00000080)));};
 };
 //BA.debugLineNum = 70;BA.debugLine="MyEditText=ED";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_ed.getObject()));
 //BA.debugLineNum = 78;BA.debugLine="If Props.ContainsKey(\"CornerColor\") Then";
if (_props.ContainsKey((Object)("CornerColor"))) { 
 //BA.debugLineNum = 79;BA.debugLine="CornerColor=xui.PaintOrColorToColor(Props.Get(\"C";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _vvvvv0.PaintOrColorToColor(_props.Get((Object)("CornerColor")));
 }else {
 //BA.debugLineNum = 81;BA.debugLine="CornerColor=lbx.TextColor";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _lbx.getTextColor();
 };
 //BA.debugLineNum = 84;BA.debugLine="MyEditText.Text=lbx.Text";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setText(BA.ObjectToCharSequence(_lbx.getText()));
 //BA.debugLineNum = 85;BA.debugLine="MyEditText.TextColor=lbx.TextColor";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setTextColor(_lbx.getTextColor());
 //BA.debugLineNum = 86;BA.debugLine="MyEditText.TextSize=lbx.TextSize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setTextSize(_lbx.getTextSize());
 //BA.debugLineNum = 87;BA.debugLine="MyEditText.Font=lbx.Font";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setFont(_lbx.getFont());
 //BA.debugLineNum = 89;BA.debugLine="Try";
try { //BA.debugLineNum = 90;BA.debugLine="Log(mBase.Color)";
__c.LogImpl("927787313",BA.NumberToString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getColor()),0);
 } 
       catch (Exception e23) {
			ba.setLastException(e23); //BA.debugLineNum = 92;BA.debugLine="mBase.Color=xui.Color_Transparent";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setColor(_vvvvv0.Color_Transparent);
 };
 //BA.debugLineNum = 94;BA.debugLine="MyEditText.SetColorAndBorder(mBase.Color,1dip,Cor";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.SetColorAndBorder(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getColor(),__c.DipToCurrent((int) (1)),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 96;BA.debugLine="LabelHint.Text=Props.Get(\"Hint\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setText(BA.ObjectToCharSequence(_props.Get((Object)("Hint"))));
 //BA.debugLineNum = 97;BA.debugLine="LabelHint.TextColor=xui.PaintOrColorToColor(Props";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setTextColor(_vvvvv0.PaintOrColorToColor(_props.Get((Object)("HintTextColor"))));
 //BA.debugLineNum = 98;BA.debugLine="LabelHint.SetColorAndBorder(xui.PaintOrColorToCol";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.SetColorAndBorder(_vvvvv0.PaintOrColorToColor(_props.Get((Object)("HintBackGroundColor"))),__c.DipToCurrent((int) (0)),_vvvvv0.Color_Transparent,__c.DipToCurrent((int) (15)));
 //BA.debugLineNum = 99;BA.debugLine="LabelHint.SetTextAlignment(\"CENTER\",\"CENTER\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 100;BA.debugLine="HintTextSize=MyEditText.TextSize-2";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTextSize()-2);
 //BA.debugLineNum = 101;BA.debugLine="Animated=Props.Get(\"Animated\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = BA.ObjectToBoolean(_props.Get((Object)("Animated")));
 //BA.debugLineNum = 103;BA.debugLine="If Props.ContainsKey(\"RTL\") Then RTL=Props.Get(\"R";
if (_props.ContainsKey((Object)("RTL"))) { 
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = BA.ObjectToBoolean(_props.Get((Object)("RTL")));};
 //BA.debugLineNum = 104;BA.debugLine="mBase.Color=xui.Color_Transparent";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setColor(_vvvvv0.Color_Transparent);
 //BA.debugLineNum = 105;BA.debugLine="Direction";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1();
 //BA.debugLineNum = 110;BA.debugLine="mBase.AddView(MyEditText,0dip,15dip,mBase.Width-";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (15)),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getWidth()-__c.DipToCurrent((int) (5))),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight()-__c.DipToCurrent((int) (15))));
 //BA.debugLineNum = 115;BA.debugLine="mBase.AddView(LabelHint,5dip,5dip,mBase.Width-5di";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5)),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getWidth()-__c.DipToCurrent((int) (5))),__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 117;BA.debugLine="HintReduce=(MyEditText.Text.Length=0)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getText().length()==0);
 //BA.debugLineNum = 118;BA.debugLine="HintAnimation((MyEditText.Text.Length>0))";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3((_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getText().length()>0));
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1() throws Exception{
anywheresoftware.b4j.object.JavaObject _tf = null;
 //BA.debugLineNum = 263;BA.debugLine="Private Sub Direction";
 //BA.debugLineNum = 264;BA.debugLine="If RTL Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5) { 
 //BA.debugLineNum = 269;BA.debugLine="Dim TF = MyEditText As JavaObject";
_tf = new anywheresoftware.b4j.object.JavaObject();
_tf = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getObject()));
 //BA.debugLineNum = 270;BA.debugLine="TF.RunMethod(\"setPadding\", Array As Object(5dip,";
_tf.RunMethod("setPadding",new Object[]{(Object)(__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (0))),(Object)(__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (0)))});
 //BA.debugLineNum = 271;BA.debugLine="MyEditText.SetTextAlignment(\"CENTER\",\"RIGHT\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.SetTextAlignment("CENTER","RIGHT");
 }else {
 //BA.debugLineNum = 280;BA.debugLine="MyEditText.SetTextAlignment(\"CENTER\",\"LEFT\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.SetTextAlignment("CENTER","LEFT");
 };
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return "";
}
public boolean  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6() throws Exception{
 //BA.debugLineNum = 189;BA.debugLine="Public Sub getAnimateHint As Boolean";
 //BA.debugLineNum = 190;BA.debugLine="Return Animated";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Public Sub GetBase As B4XView";
 //BA.debugLineNum = 132;BA.debugLine="Return mBase";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public String  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Public Sub getHint As String";
 //BA.debugLineNum = 150;BA.debugLine="Return LabelHint.Text";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getText();
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0() throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Public Sub getHintFont As B4XFont";
 //BA.debugLineNum = 158;BA.debugLine="Return LabelHint.Font";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getFont();
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.EditTextWrapper  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4() throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Public Sub getNativeObject As EditText";
 //BA.debugLineNum = 137;BA.debugLine="Return MyEditText";
if (true) return (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getObject()));
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public String  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0() throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Public Sub getText As String";
 //BA.debugLineNum = 173;BA.debugLine="Return MyEditText.Text";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getText();
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5() throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Public Sub getTextFont As B4XFont";
 //BA.debugLineNum = 181;BA.debugLine="Return MyEditText.Font";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getFont();
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(boolean _newreducehint) throws Exception{
int _startlefthint = 0;
 //BA.debugLineNum = 220;BA.debugLine="Private Sub HintAnimation(NewReduceHint As Boolean";
 //BA.debugLineNum = 221;BA.debugLine="Dim StartLeftHint As Int = 15dip";
_startlefthint = __c.DipToCurrent((int) (15));
 //BA.debugLineNum = 223;BA.debugLine="If xui.IsB4J And Pss Then NewReduceHint=False";
if (_vvvvv0.getIsB4J() && _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2) { 
_newreducehint = __c.False;};
 //BA.debugLineNum = 224;BA.debugLine="If (NewReduceHint<>HintReduce) And (Animated) The";
if ((_newreducehint!=_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) && (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1)) { 
 //BA.debugLineNum = 225;BA.debugLine="If NewReduceHint Then";
if (_newreducehint) { 
 //BA.debugLineNum = 226;BA.debugLine="LabelHint.TextSize=HintTextSize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setTextSize((float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7));
 //BA.debugLineNum = 227;BA.debugLine="If RTL Then StartLeftHint=mBase.Width-15dip-Mea";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5) { 
_startlefthint = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getWidth()-__c.DipToCurrent((int) (15))-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4());};
 //BA.debugLineNum = 228;BA.debugLine="LabelHint.SetLayoutAnimated(0,StartLeftHint,20d";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.SetLayoutAnimated((int) (0),_startlefthint,__c.DipToCurrent((int) (20)),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4()),__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 229;BA.debugLine="If mBase.Height>50dip Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight()>__c.DipToCurrent((int) (50))) { 
 //BA.debugLineNum = 230;BA.debugLine="LabelHint.SetLayoutAnimated(300,StartLeftHint,";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.SetLayoutAnimated((int) (300),_startlefthint,(int) (0),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4()),__c.DipToCurrent((int) (30)));
 }else {
 //BA.debugLineNum = 232;BA.debugLine="LabelHint.SetLayoutAnimated(300,StartLeftHint,";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.SetLayoutAnimated((int) (300),_startlefthint,(int) (0),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4()),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight()*0.6));
 };
 }else {
 //BA.debugLineNum = 235;BA.debugLine="LabelHint.TextSize=MyEditText.TextSize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setTextSize(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTextSize());
 //BA.debugLineNum = 236;BA.debugLine="If RTL Then StartLeftHint=mBase.Width-15dip-Mea";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5) { 
_startlefthint = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getWidth()-__c.DipToCurrent((int) (15))-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4());};
 //BA.debugLineNum = 237;BA.debugLine="LabelHint.SetLayoutAnimated(300,StartLeftHint,2";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.SetLayoutAnimated((int) (300),_startlefthint,__c.DipToCurrent((int) (20)),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4()),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight()-__c.DipToCurrent((int) (25))));
 };
 }else {
 //BA.debugLineNum = 240;BA.debugLine="LabelHint.TextSize=HintTextSize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setTextSize((float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7));
 //BA.debugLineNum = 241;BA.debugLine="If RTL Then StartLeftHint=mBase.Width-15dip-Meas";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5) { 
_startlefthint = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getWidth()-__c.DipToCurrent((int) (15))-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4());};
 //BA.debugLineNum = 242;BA.debugLine="If mBase.Height>50dip Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight()>__c.DipToCurrent((int) (50))) { 
 //BA.debugLineNum = 243;BA.debugLine="LabelHint.SetLayoutAnimated(300,StartLeftHint,0";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.SetLayoutAnimated((int) (300),_startlefthint,(int) (0),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4()),__c.DipToCurrent((int) (30)));
 }else {
 //BA.debugLineNum = 245;BA.debugLine="LabelHint.SetLayoutAnimated(300,StartLeftHint,0";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.SetLayoutAnimated((int) (300),_startlefthint,(int) (0),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4()),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight()*0.6));
 };
 };
 //BA.debugLineNum = 249;BA.debugLine="HintReduce=NewReduceHint";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _newreducehint;
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4a.objects.LabelWrapper _lh = null;
 //BA.debugLineNum = 31;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 32;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _eventname;
 //BA.debugLineNum = 33;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _callback;
 //BA.debugLineNum = 35;BA.debugLine="Dim LH As Label";
_lh = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 36;BA.debugLine="LH.Initialize(\"LabelHint\")";
_lh.Initialize(ba,"LabelHint");
 //BA.debugLineNum = 37;BA.debugLine="LabelHint=LH";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lh.getObject()));
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public double  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _pn = null;
anywheresoftware.b4a.objects.B4XCanvas _cvs1 = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
 //BA.debugLineNum = 252;BA.debugLine="Private Sub MeasureText As Double";
 //BA.debugLineNum = 253;BA.debugLine="Dim Pn As B4XView = xui.CreatePanel(\"\")";
_pn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pn = _vvvvv0.CreatePanel(ba,"");
 //BA.debugLineNum = 254;BA.debugLine="Pn.SetLayoutAnimated(0,0,0,mBase.Width,mBase.Heig";
_pn.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getWidth(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight());
 //BA.debugLineNum = 255;BA.debugLine="Dim cvs1 As B4XCanvas";
_cvs1 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 256;BA.debugLine="cvs1.Initialize(Pn)";
_cvs1.Initialize(_pn);
 //BA.debugLineNum = 258;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(LabelHint.Tex";
_r = _cvs1.MeasureText(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getText(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getFont());
 //BA.debugLineNum = 260;BA.debugLine="Return r.Width+14dip";
if (true) return _r.getWidth()+__c.DipToCurrent((int) (14));
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return 0;
}
public String  _myedittext_action() throws Exception{
 //BA.debugLineNum = 216;BA.debugLine="Private Sub MyEditText_Action";
 //BA.debugLineNum = 217;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_EnterPr";
if (_vvvvv0.SubExists(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_EnterPressed",(int) (0))) { 
__c.CallSubNew(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_EnterPressed");};
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return "";
}
public String  _myedittext_beginedit() throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="Private Sub MyEditText_BeginEdit";
 //BA.debugLineNum = 209;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_FocusCh";
if (_vvvvv0.SubExists(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_FocusChanged",(int) (1))) { 
__c.CallSubNew2(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_FocusChanged",(Object)(__c.True));};
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return "";
}
public String  _myedittext_endedit() throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Private Sub MyEdittext_EndEdit";
 //BA.debugLineNum = 213;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_FocusCh";
if (_vvvvv0.SubExists(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_FocusChanged",(int) (1))) { 
__c.CallSubNew2(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_FocusChanged",(Object)(__c.False));};
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return "";
}
public String  _myedittext_enterpressed() throws Exception{
 //BA.debugLineNum = 200;BA.debugLine="private Sub MyEditText_EnterPressed";
 //BA.debugLineNum = 201;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_EnterPr";
if (_vvvvv0.SubExists(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_EnterPressed",(int) (0))) { 
__c.CallSubNew(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_EnterPressed");};
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return "";
}
public String  _myedittext_focuschanged(boolean _hasfocus) throws Exception{
 //BA.debugLineNum = 204;BA.debugLine="Private Sub MyEditText_FocusChanged (HasFocus As B";
 //BA.debugLineNum = 205;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_FocusCh";
if (_vvvvv0.SubExists(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_FocusChanged",(int) (1))) { 
__c.CallSubNew2(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_FocusChanged",(Object)(_hasfocus));};
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return "";
}
public String  _myedittext_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Private Sub MyEditText_TextChanged (Old As String,";
 //BA.debugLineNum = 196;BA.debugLine="HintAnimation(New.Length>0)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(_new.length()>0);
 //BA.debugLineNum = 197;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_TextCha";
if (_vvvvv0.SubExists(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_TextChanged",(int) (2))) { 
__c.CallSubNew3(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_TextChanged",(Object)(_old),(Object)(_new));};
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(boolean _b) throws Exception{
 //BA.debugLineNum = 184;BA.debugLine="Public Sub setAnimateHint(B As Boolean)";
 //BA.debugLineNum = 185;BA.debugLine="Animated=B";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _b;
 //BA.debugLineNum = 186;BA.debugLine="HintAnimation((MyEditText.Text.Length>0))";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3((_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getText().length()>0));
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(String _text) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Public Sub setHint(Text As String)";
 //BA.debugLineNum = 146;BA.debugLine="LabelHint.Text=Text";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Public Sub setHintFont(Fnt As B4XFont)";
 //BA.debugLineNum = 154;BA.debugLine="LabelHint.Font=Fnt";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setFont(_fnt);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(String _text) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Public Sub setText(Text As String)";
 //BA.debugLineNum = 162;BA.debugLine="MyEditText.Text=Text";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 163;BA.debugLine="If Animated Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1) { 
 //BA.debugLineNum = 164;BA.debugLine="HintAnimation(True)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(__c.True);
 }else {
 //BA.debugLineNum = 167;BA.debugLine="HintAnimation(False)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(__c.False);
 };
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Public Sub setTextFont(Fnt As B4XFont)";
 //BA.debugLineNum = 177;BA.debugLine="MyEditText.Font=Fnt";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setFont(_fnt);
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}

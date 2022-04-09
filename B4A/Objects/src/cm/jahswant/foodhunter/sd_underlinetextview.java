package cm.jahswant.foodhunter;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class sd_underlinetextview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "cm.jahswant.foodhunter.sd_underlinetextview");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", cm.jahswant.foodhunter.sd_underlinetextview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = "";
public Object _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvv0 = null;
public Object _vvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
public b4a.example.dateutils _vvvvvv0 = null;
public cm.jahswant.foodhunter.main _vvvvvvv1 = null;
public cm.jahswant.foodhunter.utils _vvvvvvv2 = null;
public cm.jahswant.foodhunter.starter _vvvvvvv3 = null;
public cm.jahswant.foodhunter.b4xpages _vvvvvvv4 = null;
public cm.jahswant.foodhunter.b4xcollections _vvvvvvv5 = null;
public cm.jahswant.foodhunter.httputils2service _vvvvvvv6 = null;
public cm.jahswant.foodhunter.xuiviewsutils _vvvvvvv7 = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 76;BA.debugLine="TextView.SetLayoutAnimated(0,0,0,Width,Height)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 //BA.debugLineNum = 77;BA.debugLine="OutLineBase.SetLayoutAnimated(0,5dip,Height-3dip,";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (5)),(int) (_height-__c.DipToCurrent((int) (3))),(int) (_width-__c.DipToCurrent((int) (10))),__c.DipToCurrent((int) (3)));
 //BA.debugLineNum = 78;BA.debugLine="OutLine.SetLayoutAnimated(0,5dip,Height-3dip,Widt";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (5)),(int) (_height-__c.DipToCurrent((int) (3))),(int) (_width-__c.DipToCurrent((int) (10))),__c.DipToCurrent((int) (3)));
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = "";
 //BA.debugLineNum = 10;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new Object();
 //BA.debugLineNum = 11;BA.debugLine="Public mBase As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private xui As XUI 'ignore";
_vvvvv0 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 13;BA.debugLine="Public Tag As Object";
_vvvvvvvvvvvvvvvvvvvvvvvvv7 = new Object();
 //BA.debugLineNum = 15;BA.debugLine="Public ExpansionTime As Int = 700";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) (700);
 //BA.debugLineNum = 16;BA.debugLine="Private TextView As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private OutLineBase As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private OutLine As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public void  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
ResumableSub_DesignerCreateView rsub = new ResumableSub_DesignerCreateView(this,_base,_lbl,_props);
rsub.resume(ba, null);
}
public static class ResumableSub_DesignerCreateView extends BA.ResumableSub {
public ResumableSub_DesignerCreateView(cm.jahswant.foodhunter.sd_underlinetextview parent,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) {
this.parent = parent;
this._base = _base;
this._lbl = _lbl;
this._props = _props;
}
cm.jahswant.foodhunter.sd_underlinetextview parent;
Object _base;
anywheresoftware.b4a.objects.LabelWrapper _lbl;
anywheresoftware.b4a.objects.collections.Map _props;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
anywheresoftware.b4a.objects.EditTextWrapper _ed = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 31;BA.debugLine="mBase = Base";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 32;BA.debugLine="Tag = mBase.Tag";
parent._vvvvvvvvvvvvvvvvvvvvvvvvv7 = parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getTag();
 //BA.debugLineNum = 33;BA.debugLine="mBase.Tag = Me";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setTag(parent);
 //BA.debugLineNum = 35;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 38;BA.debugLine="Dim ED As EditText";
_ed = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 39;BA.debugLine="ED.Initialize(\"MyEditText\")";
_ed.Initialize(ba,"MyEditText");
 //BA.debugLineNum = 40;BA.debugLine="If Props.ContainsKey(\"Password\") Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_props.ContainsKey((Object)("Password"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 41;BA.debugLine="If Props.Get(\"Password\").As(Boolean) Then ED.In";
if (true) break;

case 4:
//if
this.state = 9;
if ((BA.ObjectToBoolean(_props.Get((Object)("Password"))))) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
_ed.setInputType(parent.__c.Bit.Or(_ed.getInputType(),((int)0x00000080)));
if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 59;BA.debugLine="TextView=ED";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_ed.getObject()));
 //BA.debugLineNum = 61;BA.debugLine="TextView.TextColor=xlbl.TextColor";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setTextColor(_xlbl.getTextColor());
 //BA.debugLineNum = 62;BA.debugLine="TextView.Color=xui.Color_Transparent";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setColor(parent._vvvvv0.Color_Transparent);
 //BA.debugLineNum = 65;BA.debugLine="mBase.AddView(TextView,0,0,mBase.Width,mBase.Heig";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.AddView((android.view.View)(parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getObject()),(int) (0),(int) (0),parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getWidth(),parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight());
 //BA.debugLineNum = 66;BA.debugLine="mBase.AddView(OutLineBase,5dip,mBase.Height-3dip,";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.AddView((android.view.View)(parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getObject()),parent.__c.DipToCurrent((int) (5)),(int) (parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight()-parent.__c.DipToCurrent((int) (3))),(int) (parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getWidth()-parent.__c.DipToCurrent((int) (10))),parent.__c.DipToCurrent((int) (3)));
 //BA.debugLineNum = 67;BA.debugLine="mBase.AddView(OutLine,mBase.Width/2,mBase.Height-";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.AddView((android.view.View)(parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getObject()),(int) (parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getWidth()/(double)2),(int) (parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight()-parent.__c.DipToCurrent((int) (3))),(int) (0),parent.__c.DipToCurrent((int) (3)));
 //BA.debugLineNum = 68;BA.debugLine="OutLineBase.Color=xui.Color_LightGray";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setColor(parent._vvvvv0.Color_LightGray);
 //BA.debugLineNum = 69;BA.debugLine="TextView.Text=xlbl.Text";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setText(BA.ObjectToCharSequence(_xlbl.getText()));
 //BA.debugLineNum = 71;BA.debugLine="Sleep(400)";
parent.__c.Sleep(ba,this,(int) (400));
this.state = 17;
return;
case 17:
//C
this.state = 11;
;
 //BA.debugLineNum = 72;BA.debugLine="If True=Props.Get(\"Outline\") Then ShowLine";
if (true) break;

case 11:
//if
this.state = 16;
if (parent.__c.True==BA.ObjectToBoolean(_props.Get((Object)("Outline")))) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3();
if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Public Sub GetBase As B4XView";
 //BA.debugLineNum = 82;BA.debugLine="Return mBase";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public String  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Public Sub getHint As String";
 //BA.debugLineNum = 100;BA.debugLine="Return TextView.Text";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getText();
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0() throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Public Sub getHintFont As B4XFont";
 //BA.debugLineNum = 108;BA.debugLine="Return TextView.Font";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getFont();
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.EditTextWrapper  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4() throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Public Sub getNativeObject As EditText";
 //BA.debugLineNum = 87;BA.debugLine="Return TextView";
if (true) return (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getObject()));
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public String  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0() throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Public Sub getText As String";
 //BA.debugLineNum = 116;BA.debugLine="Return TextView.Text";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getText();
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5() throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Public Sub getTextFont As B4XFont";
 //BA.debugLineNum = 124;BA.debugLine="Return TextView.Font";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getFont();
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public void  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2() throws Exception{
ResumableSub_HideLine rsub = new ResumableSub_HideLine(this);
rsub.resume(ba, null);
}
public static class ResumableSub_HideLine extends BA.ResumableSub {
public ResumableSub_HideLine(cm.jahswant.foodhunter.sd_underlinetextview parent) {
this.parent = parent;
}
cm.jahswant.foodhunter.sd_underlinetextview parent;
int _center = 0;
double _sdip = 0;
int _endpos = 0;
double _time = 0;
int _i = 0;
int step7;
int limit7;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 170;BA.debugLine="Dim Center As Int = mBase.Width/2";
_center = (int) (parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getWidth()/(double)2);
 //BA.debugLineNum = 172;BA.debugLine="OutLine.Color=TextView.TextColor";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setColor(parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getTextColor());
 //BA.debugLineNum = 173;BA.debugLine="OutLine.SetLayoutAnimated(0,5dip,mBase.Height-3di";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.SetLayoutAnimated((int) (0),parent.__c.DipToCurrent((int) (5)),(int) (parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight()-parent.__c.DipToCurrent((int) (3))),(int) (parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getWidth()-parent.__c.DipToCurrent((int) (10))),parent.__c.DipToCurrent((int) (3)));
 //BA.debugLineNum = 176;BA.debugLine="Dim Sdip As Double = (100dip/50)";
_sdip = (parent.__c.DipToCurrent((int) (100))/(double)50);
 //BA.debugLineNum = 177;BA.debugLine="Dim EndPos As Int = (Center-5dip)/ Sdip";
_endpos = (int) ((_center-parent.__c.DipToCurrent((int) (5)))/(double)_sdip);
 //BA.debugLineNum = 178;BA.debugLine="Dim time As Double = ExpansionTime/ EndPos";
_time = parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5/(double)_endpos;
 //BA.debugLineNum = 179;BA.debugLine="For  i=5 To EndPos";
if (true) break;

case 1:
//for
this.state = 4;
step7 = 1;
limit7 = _endpos;
_i = (int) (5) ;
this.state = 5;
if (true) break;

case 5:
//C
this.state = 4;
if ((step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7)) this.state = 3;
if (true) break;

case 6:
//C
this.state = 5;
_i = ((int)(0 + _i + step7)) ;
if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 180;BA.debugLine="OutLine.SetLayoutAnimated(time,5dip+(i*Sdip),mB";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.SetLayoutAnimated((int) (_time),(int) (parent.__c.DipToCurrent((int) (5))+(_i*_sdip)),(int) (parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight()-parent.__c.DipToCurrent((int) (3))),(int) ((parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getWidth()-parent.__c.DipToCurrent((int) (10)))-(_i*_sdip*2)),parent.__c.DipToCurrent((int) (3)));
 //BA.debugLineNum = 181;BA.debugLine="Sleep(time)";
parent.__c.Sleep(ba,this,(int) (_time));
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
 if (true) break;
if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 183;BA.debugLine="OutLine.SetLayoutAnimated(0,Center,mBase.Height-";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.SetLayoutAnimated((int) (0),_center,(int) (parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight()-parent.__c.DipToCurrent((int) (3))),parent.__c.DipToCurrent((int) (0)),parent.__c.DipToCurrent((int) (3)));
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 22;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _eventname;
 //BA.debugLineNum = 23;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _callback;
 //BA.debugLineNum = 25;BA.debugLine="OutLine=xui.CreatePanel(\"\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _vvvvv0.CreatePanel(ba,"");
 //BA.debugLineNum = 26;BA.debugLine="OutLineBase=xui.CreatePanel(\"\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvv0.CreatePanel(ba,"");
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(String _text) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Public Sub setHint(Text As String)";
 //BA.debugLineNum = 96;BA.debugLine="TextView.Text=Text";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Public Sub setHintFont(Fnt As B4XFont)";
 //BA.debugLineNum = 104;BA.debugLine="TextView.Font=Fnt";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setFont(_fnt);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(String _text) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Public Sub setText(Text As String)";
 //BA.debugLineNum = 112;BA.debugLine="TextView.Text=Text";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Public Sub setTextFont(Fnt As B4XFont)";
 //BA.debugLineNum = 120;BA.debugLine="TextView.Font=Fnt";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setFont(_fnt);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3() throws Exception{
int _center = 0;
 //BA.debugLineNum = 161;BA.debugLine="Private Sub ShowLine";
 //BA.debugLineNum = 162;BA.debugLine="Dim Center As Int = mBase.Width/2";
_center = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getWidth()/(double)2);
 //BA.debugLineNum = 164;BA.debugLine="OutLine.Color=TextView.TextColor";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setColor(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getTextColor());
 //BA.debugLineNum = 165;BA.debugLine="OutLine.SetLayoutAnimated(0,Center,mBase.Height-3";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.SetLayoutAnimated((int) (0),_center,(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight()-__c.DipToCurrent((int) (3))),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (3)));
 //BA.debugLineNum = 166;BA.debugLine="OutLine.SetLayoutAnimated(ExpansionTime,5dip,mBas";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.SetLayoutAnimated(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5,__c.DipToCurrent((int) (5)),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight()-__c.DipToCurrent((int) (3))),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getWidth()-__c.DipToCurrent((int) (10))),__c.DipToCurrent((int) (3)));
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return "";
}
public String  _textview_action() throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Private Sub TextView_Action";
 //BA.debugLineNum = 154;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_EnterPr";
if (_vvvvv0.SubExists(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_EnterPressed",(int) (0))) { 
__c.CallSubNew(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_EnterPressed");};
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return "";
}
public String  _textview_beginedit() throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Private Sub TextView_BeginEdit";
 //BA.debugLineNum = 146;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_FocusCh";
if (_vvvvv0.SubExists(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_FocusChanged",(int) (1))) { 
__c.CallSubNew2(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_FocusChanged",(Object)(__c.True));};
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return "";
}
public String  _textview_endedit() throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Private Sub TextView_EndEdit";
 //BA.debugLineNum = 150;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_FocusCh";
if (_vvvvv0.SubExists(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_FocusChanged",(int) (1))) { 
__c.CallSubNew2(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_FocusChanged",(Object)(__c.False));};
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return "";
}
public String  _textview_enterpressed() throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="private Sub TextView_EnterPressed";
 //BA.debugLineNum = 138;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_EnterPr";
if (_vvvvv0.SubExists(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_EnterPressed",(int) (0))) { 
__c.CallSubNew(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_EnterPressed");};
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return "";
}
public String  _textview_focuschanged(boolean _hasfocus) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Private Sub TextView_FocusChanged (HasFocus As Boo";
 //BA.debugLineNum = 142;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_FocusCh";
if (_vvvvv0.SubExists(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_FocusChanged",(int) (1))) { 
__c.CallSubNew2(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_FocusChanged",(Object)(_hasfocus));};
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public String  _textview_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Private Sub TextView_TextChanged (Old As String, N";
 //BA.debugLineNum = 134;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_TextCha";
if (_vvvvv0.SubExists(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_TextChanged",(int) (2))) { 
__c.CallSubNew3(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_TextChanged",(Object)(_old),(Object)(_new));};
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(boolean _show) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Public Sub UnderLine(Show As Boolean)";
 //BA.debugLineNum = 128;BA.debugLine="If Show Then ShowLine Else  HideLine";
if (_show) { 
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3();}
else {
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();};
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}

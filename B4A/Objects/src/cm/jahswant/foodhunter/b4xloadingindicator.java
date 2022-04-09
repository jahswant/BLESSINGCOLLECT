package cm.jahswant.foodhunter;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xloadingindicator extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "cm.jahswant.foodhunter.b4xloadingindicator");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", cm.jahswant.foodhunter.b4xloadingindicator.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = "";
public Object _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvv0 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
public anywheresoftware.b4a.objects.B4XCanvas _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = "";
public Object _vvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public b4a.example.dateutils _vvvvvv0 = null;
public cm.jahswant.foodhunter.main _vvvvvvv1 = null;
public cm.jahswant.foodhunter.utils _vvvvvvv2 = null;
public cm.jahswant.foodhunter.starter _vvvvvvv3 = null;
public cm.jahswant.foodhunter.b4xpages _vvvvvvv4 = null;
public cm.jahswant.foodhunter.b4xcollections _vvvvvvv5 = null;
public cm.jahswant.foodhunter.httputils2service _vvvvvvv6 = null;
public cm.jahswant.foodhunter.xuiviewsutils _vvvvvvv7 = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 38;BA.debugLine="cvs.Resize(Width, Height)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.Resize((float) (_width),(float) (_height));
 //BA.debugLineNum = 39;BA.debugLine="MainLoop";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = "";
 //BA.debugLineNum = 9;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new Object();
 //BA.debugLineNum = 10;BA.debugLine="Public mBase As B4XView 'ignore";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private xui As XUI 'ignore";
_vvvvv0 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 12;BA.debugLine="Private clr As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
 //BA.debugLineNum = 13;BA.debugLine="Private index As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
 //BA.debugLineNum = 14;BA.debugLine="Private cvs As B4XCanvas";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 15;BA.debugLine="Private duration As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
 //BA.debugLineNum = 16;BA.debugLine="Private DrawingSubName As String";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = "";
 //BA.debugLineNum = 17;BA.debugLine="Public Tag As Object";
_vvvvvvvvvvvvvvvvvvvvvvvvv7 = new Object();
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
String _style = "";
 //BA.debugLineNum = 26;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 27;BA.debugLine="mBase = Base";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 28;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getTag();
 //BA.debugLineNum = 28;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setTag(this);
 //BA.debugLineNum = 29;BA.debugLine="clr = xui.PaintOrColorToColor(Props.Get(\"Color\"";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvv0.PaintOrColorToColor(_props.Get((Object)("Color")));
 //BA.debugLineNum = 30;BA.debugLine="Dim style As String= Props.Get(\"IndicatorStyle\")";
_style = BA.ObjectToString(_props.Get((Object)("IndicatorStyle")));
 //BA.debugLineNum = 31;BA.debugLine="Dim duration As Int = Props.Get(\"Duration\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = (int)(BA.ObjectToNumber(_props.Get((Object)("Duration"))));
 //BA.debugLineNum = 32;BA.debugLine="DrawingSubName = \"Draw_\" & style.Replace(\" \", \"\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = "Draw_"+_style.replace(" ","");
 //BA.debugLineNum = 33;BA.debugLine="cvs.Initialize(mBase)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.Initialize(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5);
 //BA.debugLineNum = 34;BA.debugLine="MainLoop";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public String  _draw_arc1(float _progress) throws Exception{
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
float _r = 0f;
 //BA.debugLineNum = 105;BA.debugLine="Private Sub Draw_Arc1 (Progress As Float)";
 //BA.debugLineNum = 106;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
 //BA.debugLineNum = 107;BA.debugLine="Dim r As Float = cvs.TargetRect.CenterX - 5dip";
_r = (float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTargetRect().getCenterX()-__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 108;BA.debugLine="If Progress < 0.5 Then";
if (_progress<0.5) { 
 //BA.debugLineNum = 109;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX, cvs.Targ";
_p.InitializeArc(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTargetRect().getCenterX(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTargetRect().getCenterY(),_r,(float) (-90),(float) (_progress*2*360));
 }else {
 //BA.debugLineNum = 111;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX, cvs.Targ";
_p.InitializeArc(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTargetRect().getCenterX(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTargetRect().getCenterY(),_r,(float) (-90),(float) (-(1-_progress)*2*360));
 };
 //BA.debugLineNum = 113;BA.debugLine="cvs.ClipPath(p)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.ClipPath(_p);
 //BA.debugLineNum = 114;BA.debugLine="cvs.DrawRect(cvs.TargetRect, clr, True, 0)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.DrawRect(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTargetRect(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,__c.True,(float) (0));
 //BA.debugLineNum = 115;BA.debugLine="cvs.RemoveClip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.RemoveClip();
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public String  _draw_arc2(float _progress) throws Exception{
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
float _r = 0f;
 //BA.debugLineNum = 118;BA.debugLine="Private Sub Draw_Arc2 (Progress As Float)";
 //BA.debugLineNum = 119;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
 //BA.debugLineNum = 120;BA.debugLine="Dim r As Float = cvs.TargetRect.CenterX - 5dip";
_r = (float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTargetRect().getCenterX()-__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 121;BA.debugLine="If Progress < 0.5 Then";
if (_progress<0.5) { 
 //BA.debugLineNum = 122;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX, cvs.Targ";
_p.InitializeArc(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTargetRect().getCenterX(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTargetRect().getCenterY(),_r,(float) (-90),(float) (_progress*2*360));
 }else {
 //BA.debugLineNum = 124;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX, cvs.Targ";
_p.InitializeArc(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTargetRect().getCenterX(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTargetRect().getCenterY(),_r,(float) (-90),(float) (360-(_progress-0.5)*2*360));
 };
 //BA.debugLineNum = 126;BA.debugLine="cvs.ClipPath(p)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.ClipPath(_p);
 //BA.debugLineNum = 127;BA.debugLine="cvs.DrawRect(cvs.TargetRect, clr, True, 0)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.DrawRect(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTargetRect(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,__c.True,(float) (0));
 //BA.debugLineNum = 128;BA.debugLine="cvs.RemoveClip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.RemoveClip();
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return "";
}
public String  _draw_fivelines1(float _progress) throws Exception{
int _minr = 0;
int _maxr = 0;
int _dx = 0;
int _i = 0;
float _r = 0f;
 //BA.debugLineNum = 95;BA.debugLine="Private Sub Draw_FiveLines1(Progress As Float)";
 //BA.debugLineNum = 96;BA.debugLine="Dim MinR As Int = 10dip";
_minr = __c.DipToCurrent((int) (10));
 //BA.debugLineNum = 97;BA.debugLine="Dim MaxR As Int = cvs.TargetRect.Height / 2";
_maxr = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTargetRect().getHeight()/(double)2);
 //BA.debugLineNum = 98;BA.debugLine="Dim dx As Int = (cvs.TargetRect.Width - 2dip) / 5";
_dx = (int) ((_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTargetRect().getWidth()-__c.DipToCurrent((int) (2)))/(double)5);
 //BA.debugLineNum = 99;BA.debugLine="For i = 0 To 4";
{
final int step4 = 1;
final int limit4 = (int) (4);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 100;BA.debugLine="Dim r As Float = MinR + MaxR / 2 + MaxR / 2 * Si";
_r = (float) (_minr+_maxr/(double)2+_maxr/(double)2*__c.SinD(_progress*360-30*_i));
 //BA.debugLineNum = 101;BA.debugLine="cvs.DrawLine(2dip + i * dx, cvs.TargetRect.Cente";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.DrawLine((float) (__c.DipToCurrent((int) (2))+_i*_dx),(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTargetRect().getCenterY()-_r),(float) (__c.DipToCurrent((int) (2))+_i*_dx),(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTargetRect().getCenterY()+_r),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,(float) (__c.DipToCurrent((int) (4))));
 }
};
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public String  _draw_pacman(float _progress) throws Exception{
int _dotr = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
int _angle = 0;
int _cx = 0;
int _cy = 0;
int _r = 0;
 //BA.debugLineNum = 131;BA.debugLine="Private Sub Draw_PacMan(Progress As Float)";
 //BA.debugLineNum = 132;BA.debugLine="Dim DotR As Int = 5dip";
_dotr = __c.DipToCurrent((int) (5));
 //BA.debugLineNum = 133;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.Width - DotR - Prog";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.DrawCircle((float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTargetRect().getWidth()-_dotr-_progress*(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTargetRect().getCenterX()-__c.DipToCurrent((int) (10)))),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTargetRect().getCenterY(),(float) (_dotr),_vvvvv2(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,(int) (255-200*_progress)),__c.True,(float) (0));
 //BA.debugLineNum = 134;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
 //BA.debugLineNum = 135;BA.debugLine="Dim angle As Int = 70 * SinD(Progress * 180)";
_angle = (int) (70*__c.SinD(_progress*180));
 //BA.debugLineNum = 136;BA.debugLine="Dim cx As Int = cvs.TargetRect.CenterX - 5dip";
_cx = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTargetRect().getCenterX()-__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 137;BA.debugLine="Dim cy As Int = cvs.TargetRect.CenterY";
_cy = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTargetRect().getCenterY());
 //BA.debugLineNum = 138;BA.debugLine="Dim r As Int = cvs.TargetRect.CenterY - 5dip";
_r = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTargetRect().getCenterY()-__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 139;BA.debugLine="If angle = 0 Then";
if (_angle==0) { 
 //BA.debugLineNum = 140;BA.debugLine="cvs.DrawCircle(cx, cy, r, clr, True, 0)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.DrawCircle((float) (_cx),(float) (_cy),(float) (_r),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,__c.True,(float) (0));
 }else {
 //BA.debugLineNum = 142;BA.debugLine="p.InitializeArc(cx, cy , r, -angle / 2, -(360-an";
_p.InitializeArc((float) (_cx),(float) (_cy),(float) (_r),(float) (-_angle/(double)2),(float) (-(360-_angle)));
 //BA.debugLineNum = 143;BA.debugLine="cvs.ClipPath(p)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.ClipPath(_p);
 //BA.debugLineNum = 144;BA.debugLine="cvs.DrawRect(cvs.TargetRect, clr, True, 0)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.DrawRect(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTargetRect(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,__c.True,(float) (0));
 //BA.debugLineNum = 145;BA.debugLine="cvs.RemoveClip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.RemoveClip();
 };
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return "";
}
public String  _draw_singlecircle(float _progress) throws Exception{
int _i = 0;
 //BA.debugLineNum = 85;BA.debugLine="Private Sub Draw_SingleCircle(Progress As Float)";
 //BA.debugLineNum = 86;BA.debugLine="For i = 0 To 2";
{
final int step1 = 1;
final int limit1 = (int) (2);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 87;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX, cvs.Targe";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.DrawCircle(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTargetRect().getCenterX(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTargetRect().getCenterY(),(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTargetRect().getCenterX()*_progress),_vvvvv2(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,(int) (255-255*_progress)),__c.True,(float) (0));
 }
};
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public String  _draw_threecircles1(float _progress) throws Exception{
float _maxr = 0f;
float _r = 0f;
int _i = 0;
int _alpha = 0;
 //BA.debugLineNum = 66;BA.debugLine="Private Sub Draw_ThreeCircles1 (Progress As Float)";
 //BA.debugLineNum = 67;BA.debugLine="Dim MaxR As Float = (cvs.TargetRect.Width / 2 - 2";
_maxr = (float) ((_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTargetRect().getWidth()/(double)2-__c.DipToCurrent((int) (20)))/(double)2);
 //BA.debugLineNum = 68;BA.debugLine="Dim r As Float = 10dip + MaxR + MaxR * Sin(Progre";
_r = (float) (__c.DipToCurrent((int) (10))+_maxr+_maxr*__c.Sin(_progress*2*__c.cPI));
 //BA.debugLineNum = 69;BA.debugLine="For i = 0 To 2";
{
final int step3 = 1;
final int limit3 = (int) (2);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 70;BA.debugLine="Dim alpha As Int = i * 120 + Progress * 360";
_alpha = (int) (_i*120+_progress*360);
 //BA.debugLineNum = 72;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + r * SinD";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.DrawCircle((float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTargetRect().getCenterX()+_r*__c.SinD(_alpha)),(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTargetRect().getCenterY()+_r*__c.CosD(_alpha)),(float) (__c.DipToCurrent((int) (7))),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,__c.True,(float) (__c.DipToCurrent((int) (1))));
 }
};
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public String  _draw_threecircles2(float _progress) throws Exception{
int _minr = 0;
int _maxr = 0;
int _i = 0;
float _r = 0f;
 //BA.debugLineNum = 76;BA.debugLine="Private Sub Draw_ThreeCircles2 (Progress As Float)";
 //BA.debugLineNum = 77;BA.debugLine="Dim MinR As Int = 5dip";
_minr = __c.DipToCurrent((int) (5));
 //BA.debugLineNum = 78;BA.debugLine="Dim MaxR As Int = cvs.TargetRect.Width / 2 / 3 -";
_maxr = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTargetRect().getWidth()/(double)2/(double)3-_minr-__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 79;BA.debugLine="For i = 0 To 2";
{
final int step3 = 1;
final int limit3 = (int) (2);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 80;BA.debugLine="Dim r As Float = MinR + MaxR / 2 + MaxR / 2 * Si";
_r = (float) (_minr+_maxr/(double)2+_maxr/(double)2*__c.SinD(_progress*360-60*_i));
 //BA.debugLineNum = 81;BA.debugLine="cvs.DrawCircle(MaxR + MinR + (MinR + MaxR + 2dip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.DrawCircle((float) (_maxr+_minr+(_minr+_maxr+__c.DipToCurrent((int) (2)))*2*_i),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTargetRect().getCenterY(),_r,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,__c.True,(float) (0));
 }
};
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6() throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Public Sub Hide";
 //BA.debugLineNum = 62;BA.debugLine="mBase.Visible = False";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setVisible(__c.False);
 //BA.debugLineNum = 63;BA.debugLine="index = index + 1";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0+1);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 21;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _eventname;
 //BA.debugLineNum = 22;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _callback;
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public void  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6() throws Exception{
ResumableSub_MainLoop rsub = new ResumableSub_MainLoop(this);
rsub.resume(ba, null);
}
public static class ResumableSub_MainLoop extends BA.ResumableSub {
public ResumableSub_MainLoop(cm.jahswant.foodhunter.b4xloadingindicator parent) {
this.parent = parent;
}
cm.jahswant.foodhunter.b4xloadingindicator parent;
int _myindex = 0;
long _n = 0L;
float _progress = 0f;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 43;BA.debugLine="index = index + 1";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = (int) (parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0+1);
 //BA.debugLineNum = 44;BA.debugLine="Dim MyIndex As Int = index";
_myindex = parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
 //BA.debugLineNum = 45;BA.debugLine="Dim n As Long = DateTime.Now";
_n = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 46;BA.debugLine="Do While MyIndex = index";
if (true) break;

case 1:
//do while
this.state = 4;
while (_myindex==parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 1;
 //BA.debugLineNum = 47;BA.debugLine="Dim progress As Float = (DateTime.Now - n) / dur";
_progress = (float) ((parent.__c.DateTime.getNow()-_n)/(double)parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1);
 //BA.debugLineNum = 48;BA.debugLine="progress = progress - Floor(progress)";
_progress = (float) (_progress-parent.__c.Floor(_progress));
 //BA.debugLineNum = 49;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.ClearRect(parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTargetRect());
 //BA.debugLineNum = 50;BA.debugLine="CallSub2(Me, DrawingSubName, progress)";
parent.__c.CallSubNew2(ba,parent,parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2,(Object)(_progress));
 //BA.debugLineNum = 51;BA.debugLine="cvs.Invalidate";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.Invalidate();
 //BA.debugLineNum = 52;BA.debugLine="Sleep(10)";
parent.__c.Sleep(ba,this,(int) (10));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public int  _vvvvv2(int _c,int _alpha) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Private Sub SetAlpha (c As Int, alpha As Int) As I";
 //BA.debugLineNum = 92;BA.debugLine="Return Bit.And(0xffffff, c) + Bit.ShiftLeft(alpha";
if (true) return (int) (__c.Bit.And(((int)0xffffff),_c)+__c.Bit.ShiftLeft(_alpha,(int) (24)));
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return 0;
}
public String  _show() throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Public Sub Show";
 //BA.debugLineNum = 57;BA.debugLine="mBase.Visible = True";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setVisible(__c.True);
 //BA.debugLineNum = 58;BA.debugLine="MainLoop";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "SHOW"))
	return _show();
return BA.SubDelegator.SubNotFound;
}
}

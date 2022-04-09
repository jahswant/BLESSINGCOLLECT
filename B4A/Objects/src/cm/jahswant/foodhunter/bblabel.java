package cm.jahswant.foodhunter;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class bblabel extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "cm.jahswant.foodhunter.bblabel");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", cm.jahswant.foodhunter.bblabel.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = "";
public Object _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvv0 = null;
public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
public cm.jahswant.foodhunter.bctextengine._bcparagraphstyle _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public cm.jahswant.foodhunter.bctextengine _vvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
public cm.jahswant.foodhunter.bctextengine._bcparagraph _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
public cm.jahswant.foodhunter.bbcodeparser._bbcodeparsedata _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public Object _vvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = false;
public b4a.example.dateutils _vvvvvv0 = null;
public cm.jahswant.foodhunter.main _vvvvvvv1 = null;
public cm.jahswant.foodhunter.utils _vvvvvvv2 = null;
public cm.jahswant.foodhunter.starter _vvvvvvv3 = null;
public cm.jahswant.foodhunter.b4xpages _vvvvvvv4 = null;
public cm.jahswant.foodhunter.b4xcollections _vvvvvvv5 = null;
public cm.jahswant.foodhunter.httputils2service _vvvvvvv6 = null;
public cm.jahswant.foodhunter.xuiviewsutils _vvvvvvv7 = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 52;BA.debugLine="If DisableResizeEvent Then Return";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) { 
if (true) return "";};
 //BA.debugLineNum = 53;BA.debugLine="If Runs.IsInitialized Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.IsInitialized()) { 
 //BA.debugLineNum = 54;BA.debugLine="If ParseData.NeedToReparseWhenResize Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.NeedToReparseWhenResize /*boolean*/ ) { 
 //BA.debugLineNum = 55;BA.debugLine="ParseAndDraw";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3();
 }else {
 //BA.debugLineNum = 57;BA.debugLine="Redraw";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4();
 };
 };
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = "";
 //BA.debugLineNum = 3;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new Object();
 //BA.debugLineNum = 4;BA.debugLine="Public mBase As B4XView 'ignore";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI 'ignore";
_vvvvv0 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 6;BA.debugLine="Private Runs As List";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="Public Style As BCParagraphStyle";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new cm.jahswant.foodhunter.bctextengine._bcparagraphstyle();
 //BA.debugLineNum = 8;BA.debugLine="Private mTextEngine As BCTextEngine";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new cm.jahswant.foodhunter.bctextengine();
 //BA.debugLineNum = 9;BA.debugLine="Private mText As String";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "";
 //BA.debugLineNum = 10;BA.debugLine="Public ForegroundImageView As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Public Paragraph As BCParagraph";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = new cm.jahswant.foodhunter.bctextengine._bcparagraph();
 //BA.debugLineNum = 12;BA.debugLine="Public Padding As B4XRect";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 13;BA.debugLine="Public ParseData As BBCodeParseData";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new cm.jahswant.foodhunter.bbcodeparser._bbcodeparsedata();
 //BA.debugLineNum = 14;BA.debugLine="Public Tag As Object";
_vvvvvvvvvvvvvvvvvvvvvvvvv7 = new Object();
 //BA.debugLineNum = 15;BA.debugLine="Public DisableResizeEvent As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
 //BA.debugLineNum = 16;BA.debugLine="Public WordWrap As Boolean = True";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = __c.True;
 //BA.debugLineNum = 17;BA.debugLine="Public RTL As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = false;
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
 //BA.debugLineNum = 30;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 31;BA.debugLine="mBase = Base";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 32;BA.debugLine="Tag = mBase.Tag";
_vvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getTag();
 //BA.debugLineNum = 33;BA.debugLine="mBase.Tag = Me";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setTag(this);
 //BA.debugLineNum = 34;BA.debugLine="mBase.AddView(ForegroundImageView, 0, 0, mBase.Wi";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getObject()),(int) (0),(int) (0),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getWidth(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight());
 //BA.debugLineNum = 35;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 36;BA.debugLine="ParseData.DefaultColor = xlbl.TextColor";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.DefaultColor /*int*/  = _xlbl.getTextColor();
 //BA.debugLineNum = 37;BA.debugLine="ParseData.DefaultFont = xlbl.Font";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xlbl.getFont();
 //BA.debugLineNum = 38;BA.debugLine="ParseData.ViewsPanel = mBase";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.ViewsPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
 //BA.debugLineNum = 39;BA.debugLine="mText = xlbl.Text";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _xlbl.getText();
 //BA.debugLineNum = 44;BA.debugLine="ParseData.DefaultBoldFont = xui.CreateFont(Typefa";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.DefaultBoldFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _vvvvv0.CreateFont(__c.Typeface.CreateNew(_lbl.getTypeface(),__c.Typeface.STYLE_BOLD),_xlbl.getTextSize());
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public String  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0() throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Public Sub getText As String";
 //BA.debugLineNum = 82;BA.debugLine="Return mText";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public cm.jahswant.foodhunter.bctextengine  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1() throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Public Sub getTextEngine As BCTextEngine";
 //BA.debugLineNum = 73;BA.debugLine="Return mTextEngine";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
 //BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 21;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _eventname;
 //BA.debugLineNum = 22;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _callback;
 //BA.debugLineNum = 23;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 24;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
 //BA.debugLineNum = 25;BA.debugLine="ForegroundImageView = iv";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
 //BA.debugLineNum = 26;BA.debugLine="ParseData.Initialize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Initialize();
 //BA.debugLineNum = 27;BA.debugLine="Padding.Initialize(2dip, 2dip, 2dip, 2dip)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Initialize((float) (__c.DipToCurrent((int) (2))),(float) (__c.DipToCurrent((int) (2))),(float) (__c.DipToCurrent((int) (2))),(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3() throws Exception{
int _i = 0;
anywheresoftware.b4a.objects.collections.List _pe = null;
 //BA.debugLineNum = 85;BA.debugLine="Public Sub ParseAndDraw";
 //BA.debugLineNum = 86;BA.debugLine="For i = mBase.NumberOfViews - 1 To 1 Step -1";
{
final int step1 = -1;
final int limit1 = (int) (1);
_i = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getNumberOfViews()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 87;BA.debugLine="mBase.GetView(i).RemoveViewFromParent";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.GetView(_i).RemoveViewFromParent();
 }
};
 //BA.debugLineNum = 89;BA.debugLine="ParseData.NeedToReparseWhenResize = False";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.NeedToReparseWhenResize /*boolean*/  = __c.False;
 //BA.debugLineNum = 90;BA.debugLine="ParseData.Text = mText";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Text /*String*/  = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
 //BA.debugLineNum = 91;BA.debugLine="ParseData.Width = (mBase.Width - Padding.Left - P";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Width /*int*/  = (int) ((_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getWidth()-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getLeft()-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getRight()));
 //BA.debugLineNum = 92;BA.debugLine="if RTL Then mTextEngine.RTLAware = True";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5) { 
_vvvvvvvvvvvvvvvvvvvvvvvvvvvv5._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/  = __c.True;};
 //BA.debugLineNum = 93;BA.debugLine="Dim pe As List = mTextEngine.TagParser.Parse(Pars";
_pe = new anywheresoftware.b4a.objects.collections.List();
_pe = _vvvvvvvvvvvvvvvvvvvvvvvvvvvv5._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*cm.jahswant.foodhunter.bbcodeparser*/ ._vvvvvvvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4a.objects.collections.List*/ (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
 //BA.debugLineNum = 94;BA.debugLine="Runs = mTextEngine.TagParser.CreateRuns(pe, Parse";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvv5._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*cm.jahswant.foodhunter.bbcodeparser*/ ._vvvvvvvvvvvvvvvvvvvvvvvvvv2 /*anywheresoftware.b4a.objects.collections.List*/ (_pe,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
 //BA.debugLineNum = 95;BA.debugLine="Redraw";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4();
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4() throws Exception{
int _dx = 0;
int _dy = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
 //BA.debugLineNum = 98;BA.debugLine="Public Sub Redraw";
 //BA.debugLineNum = 99;BA.debugLine="Dim Style As BCParagraphStyle = mTextEngine.Creat";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvv5._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*cm.jahswant.foodhunter.bctextengine._bcparagraphstyle*/ ();
 //BA.debugLineNum = 100;BA.debugLine="Style.Padding = Padding";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/  = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6;
 //BA.debugLineNum = 101;BA.debugLine="Style.MaxWidth = mBase.Width";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.MaxWidth /*int*/  = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getWidth();
 //BA.debugLineNum = 102;BA.debugLine="Style.HorizontalAlignment = \"left\"";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.HorizontalAlignment /*String*/  = "left";
 //BA.debugLineNum = 103;BA.debugLine="Style.WordWrap = WordWrap";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.WordWrap /*boolean*/  = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
 //BA.debugLineNum = 104;BA.debugLine="Style.RTL = RTL";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.RTL /*boolean*/  = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
 //BA.debugLineNum = 105;BA.debugLine="Paragraph = mTextEngine.DrawText(Runs, Style, For";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvv5._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*cm.jahswant.foodhunter.bctextengine._bcparagraph*/ (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Null)));
 //BA.debugLineNum = 106;BA.debugLine="Dim dx As Int = mBase.Width / 2 - ForegroundImage";
_dx = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getWidth()/(double)2-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getWidth()/(double)2-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getLeft());
 //BA.debugLineNum = 107;BA.debugLine="Dim dy As Int = mBase.Height / 2 - ForegroundImag";
_dy = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight()/(double)2-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getHeight()/(double)2-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getTop());
 //BA.debugLineNum = 108;BA.debugLine="For Each v As B4XView In mBase.GetAllViewsRecursi";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group10 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.GetAllViewsRecursive();
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group10.Get(index10)));
 //BA.debugLineNum = 109;BA.debugLine="v.Left = v.Left + dx";
_v.setLeft((int) (_v.getLeft()+_dx));
 //BA.debugLineNum = 110;BA.debugLine="v.Top = v.Top + dy";
_v.setTop((int) (_v.getTop()+_dy));
 }
};
 //BA.debugLineNum = 112;BA.debugLine="ForegroundImageView.Visible = Paragraph.Height >";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.setVisible(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Height /*int*/ >0);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(String _t) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Public Sub setText(t As String)";
 //BA.debugLineNum = 77;BA.debugLine="mText = t";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _t;
 //BA.debugLineNum = 78;BA.debugLine="ParseAndDraw";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3();
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(cm.jahswant.foodhunter.bctextengine _b) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Public Sub setTextEngine (b As BCTextEngine)";
 //BA.debugLineNum = 63;BA.debugLine="mTextEngine = b";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = _b;
 //BA.debugLineNum = 67;BA.debugLine="If mText <> \"\" Then";
if ((_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0).equals("") == false) { 
 //BA.debugLineNum = 68;BA.debugLine="setText(mText)";
_setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 };
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "SETTEXTENGINE"))
	return _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1((cm.jahswant.foodhunter.bctextengine) args[0]);
return BA.SubDelegator.SubNotFound;
}
}

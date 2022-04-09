package cm.jahswant.foodhunter;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class bbcodeview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "cm.jahswant.foodhunter.bbcodeview");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", cm.jahswant.foodhunter.bbcodeview.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
public cm.jahswant.foodhunter.bctextengine._bcparagraph _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
public cm.jahswant.foodhunter.bbcodeparser._bbcodeparsedata _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public Object _vvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
public cm.jahswant.foodhunter.b4xorderedmap _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = false;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = false;
public anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = false;
public b4a.example.dateutils _vvvvvv0 = null;
public cm.jahswant.foodhunter.main _vvvvvvv1 = null;
public cm.jahswant.foodhunter.utils _vvvvvvv2 = null;
public cm.jahswant.foodhunter.starter _vvvvvvv3 = null;
public cm.jahswant.foodhunter.b4xpages _vvvvvvv4 = null;
public cm.jahswant.foodhunter.b4xcollections _vvvvvvv5 = null;
public cm.jahswant.foodhunter.httputils2service _vvvvvvv6 = null;
public cm.jahswant.foodhunter.xuiviewsutils _vvvvvvv7 = null;
public static class _internalbbviewurl{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.collections.List Lines;
public void Initialize() {
IsInitialized = true;
Lines = new anywheresoftware.b4a.objects.collections.List();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
 //BA.debugLineNum = 106;BA.debugLine="sv.SetLayoutAnimated(0, 0, 0, Width, Height)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 //BA.debugLineNum = 107;BA.debugLine="sv.ScrollViewContentWidth = Width";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setScrollViewContentWidth((int) (_width));
 //BA.debugLineNum = 108;BA.debugLine="If DisableAutomaticDrawingsInLazyMode Then Return";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) { 
if (true) return "";};
 //BA.debugLineNum = 109;BA.debugLine="If Runs.IsInitialized Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.IsInitialized()) { 
 //BA.debugLineNum = 110;BA.debugLine="If ParseData.NeedToReparseWhenResize Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.NeedToReparseWhenResize /*boolean*/ ) { 
 //BA.debugLineNum = 111;BA.debugLine="ParseAndDraw";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3();
 }else {
 //BA.debugLineNum = 113;BA.debugLine="Redraw";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4();
 };
 };
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = "";
 //BA.debugLineNum = 6;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new Object();
 //BA.debugLineNum = 7;BA.debugLine="Public mBase As B4XView 'ignore";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private xui As XUI 'ignore";
_vvvvv0 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 9;BA.debugLine="Private Runs As List";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
_vvvvv0 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 11;BA.debugLine="Public Style As BCParagraphStyle";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new cm.jahswant.foodhunter.bctextengine._bcparagraphstyle();
 //BA.debugLineNum = 12;BA.debugLine="Private mTextEngine As BCTextEngine";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new cm.jahswant.foodhunter.bctextengine();
 //BA.debugLineNum = 13;BA.debugLine="Private mText As String";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "";
 //BA.debugLineNum = 14;BA.debugLine="Public ForegroundImageView As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Public BackgroundImageView As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Public Paragraph As BCParagraph";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = new cm.jahswant.foodhunter.bctextengine._bcparagraph();
 //BA.debugLineNum = 17;BA.debugLine="Private TouchPanel As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Public sv As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Public Padding As B4XRect";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 20;BA.debugLine="Public ParseData As BBCodeParseData";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new cm.jahswant.foodhunter.bbcodeparser._bbcodeparsedata();
 //BA.debugLineNum = 21;BA.debugLine="Public Tag As Object";
_vvvvvvvvvvvvvvvvvvvvvvvvv7 = new Object();
 //BA.debugLineNum = 22;BA.debugLine="Public LazyLoading As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
 //BA.debugLineNum = 23;BA.debugLine="Private ImageViewsCache As List";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 24;BA.debugLine="Private UsedImageViews As B4XOrderedMap";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new cm.jahswant.foodhunter.b4xorderedmap();
 //BA.debugLineNum = 25;BA.debugLine="Public ExternalRuns As List";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 26;BA.debugLine="Public DisableAutomaticDrawingsInLazyMode As Bool";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = false;
 //BA.debugLineNum = 27;BA.debugLine="Type InternalBBViewURL (Lines As List)";
;
 //BA.debugLineNum = 28;BA.debugLine="Public RTL As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = false;
 //BA.debugLineNum = 29;BA.debugLine="Private URLToLines As Map";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 30;BA.debugLine="Public AutoUnderlineURLs As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = false;
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(boolean _invisibleonly,anywheresoftware.b4a.objects.collections.List _existing,int _offset,int _height) throws Exception{
cm.jahswant.foodhunter.bctextengine._bctextline _line = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv = null;
 //BA.debugLineNum = 182;BA.debugLine="Private Sub CleanExistingImageViews (InvisibleOnly";
 //BA.debugLineNum = 183;BA.debugLine="For Each Line As BCTextLine In Existing";
{
final anywheresoftware.b4a.BA.IterableList group1 = _existing;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (cm.jahswant.foodhunter.bctextengine._bctextline)(group1.Get(index1));
 //BA.debugLineNum = 184;BA.debugLine="If InvisibleOnly = False Or LineIsVisible(Line,";
if (_invisibleonly==__c.False || _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(_line,_offset,_height)==__c.False) { 
 //BA.debugLineNum = 185;BA.debugLine="Dim xiv As B4XView = UsedImageViews.Get(Line)";
_xiv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xiv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2._vvvvvvvvv7 /*Object*/ ((Object)(_line))));
 //BA.debugLineNum = 186;BA.debugLine="xiv.RemoveViewFromParent";
_xiv.RemoveViewFromParent();
 //BA.debugLineNum = 187;BA.debugLine="xiv.SetBitmap(Null)";
_xiv.SetBitmap((android.graphics.Bitmap)(__c.Null));
 //BA.debugLineNum = 188;BA.debugLine="ImageViewsCache.Add(xiv)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.Add((Object)(_xiv.getObject()));
 //BA.debugLineNum = 189;BA.debugLine="If InvisibleOnly = True Then UsedImageViews.Rem";
if (_invisibleonly==__c.True) { 
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2._vvvvvvvvvvv6 /*String*/ ((Object)(_line));};
 };
 }
};
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvv2() throws Exception{
cm.jahswant.foodhunter.bctextengine._bctextline _line = null;
cm.jahswant.foodhunter.bctextengine._bcunbreakabletext _un = null;
cm.jahswant.foodhunter.bctextengine._bcsinglestylesection _st = null;
cm.jahswant.foodhunter.bbcodeview._internalbbviewurl _extra = null;
 //BA.debugLineNum = 304;BA.debugLine="Private Sub CollectURLs";
 //BA.debugLineNum = 305;BA.debugLine="For Each line As BCTextLine In Paragraph.TextLine";
{
final anywheresoftware.b4a.BA.IterableList group1 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (cm.jahswant.foodhunter.bctextengine._bctextline)(group1.Get(index1));
 //BA.debugLineNum = 306;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
{
final anywheresoftware.b4a.BA.IterableList group2 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_un = (cm.jahswant.foodhunter.bctextengine._bcunbreakabletext)(group2.Get(index2));
 //BA.debugLineNum = 307;BA.debugLine="For Each st As BCSingleStyleSection In un.Singl";
{
final anywheresoftware.b4a.BA.IterableList group3 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_st = (cm.jahswant.foodhunter.bctextengine._bcsinglestylesection)(group3.Get(index3));
 //BA.debugLineNum = 308;BA.debugLine="If ParseData.URLs.ContainsKey(st.Run) Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.URLs /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_st.Run /*cm.jahswant.foodhunter.bctextengine._bctextrun*/ ))) { 
 //BA.debugLineNum = 309;BA.debugLine="Dim extra As InternalBBViewURL";
_extra = new cm.jahswant.foodhunter.bbcodeview._internalbbviewurl();
 //BA.debugLineNum = 310;BA.debugLine="If URLToLines.ContainsKey(st.Run) = False The";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.ContainsKey((Object)(_st.Run /*cm.jahswant.foodhunter.bctextengine._bctextrun*/ ))==__c.False) { 
 //BA.debugLineNum = 311;BA.debugLine="extra = CreateBCURLExtraData";
_extra = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3();
 //BA.debugLineNum = 312;BA.debugLine="URLToLines.Put(st.Run, extra)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Put((Object)(_st.Run /*cm.jahswant.foodhunter.bctextengine._bctextrun*/ ),(Object)(_extra));
 }else {
 //BA.debugLineNum = 314;BA.debugLine="extra = URLToLines.Get(st.Run)";
_extra = (cm.jahswant.foodhunter.bbcodeview._internalbbviewurl)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Get((Object)(_st.Run /*cm.jahswant.foodhunter.bctextengine._bctextrun*/ )));
 };
 //BA.debugLineNum = 316;BA.debugLine="If extra.Lines.IndexOf(line) = -1 Then";
if (_extra.Lines /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_line))==-1) { 
 //BA.debugLineNum = 317;BA.debugLine="extra.Lines.Add(line)";
_extra.Lines /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_line));
 };
 };
 }
};
 }
};
 }
};
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return "";
}
public cm.jahswant.foodhunter.bbcodeview._internalbbviewurl  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3() throws Exception{
cm.jahswant.foodhunter.bbcodeview._internalbbviewurl _t1 = null;
 //BA.debugLineNum = 325;BA.debugLine="Private Sub CreateBCURLExtraData  As InternalBBVie";
 //BA.debugLineNum = 326;BA.debugLine="Dim t1 As InternalBBViewURL";
_t1 = new cm.jahswant.foodhunter.bbcodeview._internalbbviewurl();
 //BA.debugLineNum = 327;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 328;BA.debugLine="t1.Lines.Initialize";
_t1.Lines /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 329;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
return null;
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.ScrollViewWrapper _sp = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
 //BA.debugLineNum = 59;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 60;BA.debugLine="mBase = Base";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 61;BA.debugLine="Tag = mBase.Tag";
_vvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getTag();
 //BA.debugLineNum = 62;BA.debugLine="mBase.Tag = Me";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setTag(this);
 //BA.debugLineNum = 68;BA.debugLine="Dim sp As ScrollView";
_sp = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 69;BA.debugLine="sp.Initialize2(50dip, \"sv\")";
_sp.Initialize2(ba,__c.DipToCurrent((int) (50)),"sv");
 //BA.debugLineNum = 75;BA.debugLine="LazyLoading = Props.GetDefault(\"LazyLoading\", Tru";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = BA.ObjectToBoolean(_props.GetDefault((Object)("LazyLoading"),(Object)(__c.True)));
 //BA.debugLineNum = 76;BA.debugLine="AutoUnderlineURLs = Props.GetDefault(\"AutoUnderli";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = BA.ObjectToBoolean(_props.GetDefault((Object)("AutoUnderline"),(Object)(__c.True)));
 //BA.debugLineNum = 77;BA.debugLine="If LazyLoading Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) { 
 //BA.debugLineNum = 78;BA.debugLine="ImageViewsCache.Initialize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.Initialize();
 //BA.debugLineNum = 79;BA.debugLine="UsedImageViews = B4XCollections.CreateOrderedMap";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = _vvvvvvv5._vvvv1 /*cm.jahswant.foodhunter.b4xorderedmap*/ (ba);
 };
 //BA.debugLineNum = 81;BA.debugLine="sv = sp";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_sp.getObject()));
 //BA.debugLineNum = 82;BA.debugLine="sv.Color = mBase.Color";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setColor(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getColor());
 //BA.debugLineNum = 83;BA.debugLine="sv.ScrollViewInnerPanel.Color = mBase.Color";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getScrollViewInnerPanel().setColor(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getColor());
 //BA.debugLineNum = 84;BA.debugLine="mBase.AddView(sv, 0, 0, mBase.Width, mBase.Height";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getObject()),(int) (0),(int) (0),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getWidth(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight());
 //BA.debugLineNum = 85;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 86;BA.debugLine="mText = xlbl.Text";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _xlbl.getText();
 //BA.debugLineNum = 87;BA.debugLine="ParseData.DefaultColor = xlbl.TextColor";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.DefaultColor /*int*/  = _xlbl.getTextColor();
 //BA.debugLineNum = 88;BA.debugLine="ParseData.DefaultFont = xlbl.Font";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xlbl.getFont();
 //BA.debugLineNum = 89;BA.debugLine="ParseData.ViewsPanel = sv.ScrollViewInnerPanel";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.ViewsPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getScrollViewInnerPanel();
 //BA.debugLineNum = 90;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_linkcl";
if (_vvvvv0.SubExists(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_linkclicked",(int) (1))) { 
 //BA.debugLineNum = 91;BA.debugLine="TouchPanel = xui.CreatePanel(\"TouchPanel\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _vvvvv0.CreatePanel(ba,"TouchPanel");
 };
 //BA.debugLineNum = 98;BA.debugLine="ParseData.DefaultBoldFont = xui.CreateFont(Typefa";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.DefaultBoldFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _vvvvv0.CreateFont(__c.Typeface.CreateNew(_lbl.getTypeface(),__c.Typeface.STYLE_BOLD),_xlbl.getTextSize());
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvv4() throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Private Sub DrawVisibleRegion";
 //BA.debugLineNum = 142;BA.debugLine="If DisableAutomaticDrawingsInLazyMode Then Return";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) { 
if (true) return "";};
 //BA.debugLineNum = 143;BA.debugLine="UpdateVisibleRegion(sv.ScrollViewOffsetY * mTextE";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7((int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getScrollViewOffsetY()*_vvvvvvvvvvvvvvvvvvvvvvvvvvvv5._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*float*/ ),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight()*_vvvvvvvvvvvvvvvvvvvvvvvvvvvv5._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*float*/ ));
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public cm.jahswant.foodhunter.bctextengine._bctextrun  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(float _x,float _y) throws Exception{
int _offsetx = 0;
int _offsety = 0;
cm.jahswant.foodhunter.bctextengine._bcsinglestylesection _single = null;
 //BA.debugLineNum = 269;BA.debugLine="Private Sub FindTouchedRun(x As Float, y As Float)";
 //BA.debugLineNum = 270;BA.debugLine="For Each offsetx As Int In Array(0, -5dip, 5dip)";
{
final Object[] group1 = new Object[]{(Object)(0),(Object)(-__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (5)))};
final int groupLen1 = group1.length
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_offsetx = (int)(BA.ObjectToNumber(group1[index1]));
 //BA.debugLineNum = 271;BA.debugLine="For Each offsety As Int In Array(0, -3dip, 3dip)";
{
final Object[] group2 = new Object[]{(Object)(0),(Object)(-__c.DipToCurrent((int) (3))),(Object)(__c.DipToCurrent((int) (3)))};
final int groupLen2 = group2.length
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_offsety = (int)(BA.ObjectToNumber(group2[index2]));
 //BA.debugLineNum = 272;BA.debugLine="Dim single As BCSingleStyleSection = mTextEngin";
_single = _vvvvvvvvvvvvvvvvvvvvvvvvvvvv5._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 /*cm.jahswant.foodhunter.bctextengine._bcsinglestylesection*/ (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3,(int) (_x+_offsetx),(int) (_y+_offsety));
 //BA.debugLineNum = 273;BA.debugLine="If single <> Null Then";
if (_single!= null) { 
 //BA.debugLineNum = 274;BA.debugLine="Return single.Run";
if (true) return _single.Run /*cm.jahswant.foodhunter.bctextengine._bctextrun*/ ;
 };
 }
};
 }
};
 //BA.debugLineNum = 278;BA.debugLine="Return Null";
if (true) return (cm.jahswant.foodhunter.bctextengine._bctextrun)(__c.Null);
 //BA.debugLineNum = 279;BA.debugLine="End Sub";
return null;
}
public String  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0() throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Public Sub getText As String";
 //BA.debugLineNum = 138;BA.debugLine="Return mText";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return "";
}
public cm.jahswant.foodhunter.bctextengine  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1() throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Public Sub getTextEngine As BCTextEngine";
 //BA.debugLineNum = 129;BA.debugLine="Return mTextEngine";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2() throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Public Sub getViews As Map";
 //BA.debugLineNum = 52;BA.debugLine="Return ParseData.Views";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Views /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
 //BA.debugLineNum = 33;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 34;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _eventname;
 //BA.debugLineNum = 35;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _callback;
 //BA.debugLineNum = 36;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 37;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
 //BA.debugLineNum = 38;BA.debugLine="ForegroundImageView = iv";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
 //BA.debugLineNum = 39;BA.debugLine="ParseData.Initialize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Initialize();
 //BA.debugLineNum = 40;BA.debugLine="ParseData.Views.Initialize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Views /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 //BA.debugLineNum = 41;BA.debugLine="ParseData.URLs.Initialize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.URLs /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 //BA.debugLineNum = 42;BA.debugLine="If xui.IsB4J Then";
if (_vvvvv0.getIsB4J()) { 
 //BA.debugLineNum = 43;BA.debugLine="Padding.Initialize(5dip, 5dip, 20dip, 5dip)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Initialize((float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (20))),(float) (__c.DipToCurrent((int) (5))));
 }else {
 //BA.debugLineNum = 45;BA.debugLine="Padding.Initialize(5dip, 5dip, 5dip, 5dip)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Initialize((float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))));
 };
 //BA.debugLineNum = 47;BA.debugLine="ParseData.ImageCache.Initialize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.ImageCache /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 //BA.debugLineNum = 48;BA.debugLine="URLToLines.Initialize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Initialize();
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public boolean  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(cm.jahswant.foodhunter.bctextengine._bctextline _line,int _offset,int _height) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Private Sub LineIsVisible(line As BCTextLine, offs";
 //BA.debugLineNum = 179;BA.debugLine="Return line.BaselineY + line.MaxHeightBelowBaseLi";
if (true) return _line.BaselineY /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ >=_offset && _line.BaselineY /*int*/ -_line.MaxHeightAboveBaseLine /*int*/ <=_offset+_height;
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return false;
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(cm.jahswant.foodhunter.bctextengine._bctextrun _run) throws Exception{
cm.jahswant.foodhunter.bctextengine._bctextrun _r = null;
cm.jahswant.foodhunter.bbcodeview._internalbbviewurl _extra = null;
cm.jahswant.foodhunter.bctextengine._bctextline _line = null;
 //BA.debugLineNum = 281;BA.debugLine="Private Sub MarkURL (Run As BCTextRun)";
 //BA.debugLineNum = 291;BA.debugLine="For Each r As BCTextRun In URLToLines.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_r = (cm.jahswant.foodhunter.bctextengine._bctextrun)(group1.Get(index1));
 //BA.debugLineNum = 292;BA.debugLine="If r.Underline <> (r = Run) Then";
if (_r.Underline /*boolean*/ !=((_r).equals(_run))) { 
 //BA.debugLineNum = 293;BA.debugLine="r.Underline = r = Run";
_r.Underline /*boolean*/  = (_r).equals(_run);
 //BA.debugLineNum = 294;BA.debugLine="Dim extra As InternalBBViewURL = URLToLines.Get";
_extra = (cm.jahswant.foodhunter.bbcodeview._internalbbviewurl)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Get((Object)(_r)));
 //BA.debugLineNum = 295;BA.debugLine="For Each line As BCTextLine In extra.Lines";
{
final anywheresoftware.b4a.BA.IterableList group5 = _extra.Lines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_line = (cm.jahswant.foodhunter.bctextengine._bctextline)(group5.Get(index5));
 //BA.debugLineNum = 296;BA.debugLine="If UsedImageViews.ContainsKey(line) Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2._vvvvvvvvvvvv6 /*boolean*/ ((Object)(_line))) { 
 //BA.debugLineNum = 297;BA.debugLine="mTextEngine.DrawSingleLine(line, UsedImageVie";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvv5._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 /*String*/ (_line,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2._vvvvvvvvv7 /*Object*/ ((Object)(_line)))),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
 };
 }
};
 };
 }
};
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3() throws Exception{
anywheresoftware.b4a.objects.collections.List _pe = null;
 //BA.debugLineNum = 195;BA.debugLine="Public Sub ParseAndDraw";
 //BA.debugLineNum = 196;BA.debugLine="ParseData.NeedToReparseWhenResize = False";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.NeedToReparseWhenResize /*boolean*/  = __c.False;
 //BA.debugLineNum = 197;BA.debugLine="ParseData.Text = mText";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Text /*String*/  = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
 //BA.debugLineNum = 198;BA.debugLine="ParseData.URLs.Clear";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.URLs /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
 //BA.debugLineNum = 199;BA.debugLine="ParseData.Width = (mBase.Width - Padding.Left - P";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Width /*int*/  = (int) ((_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getWidth()-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getLeft()-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getRight()));
 //BA.debugLineNum = 200;BA.debugLine="If RTL Then mTextEngine.RTLAware = True";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5) { 
_vvvvvvvvvvvvvvvvvvvvvvvvvvvv5._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/  = __c.True;};
 //BA.debugLineNum = 201;BA.debugLine="Dim pe As List = mTextEngine.TagParser.Parse(Pars";
_pe = new anywheresoftware.b4a.objects.collections.List();
_pe = _vvvvvvvvvvvvvvvvvvvvvvvvvvvv5._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*cm.jahswant.foodhunter.bbcodeparser*/ ._vvvvvvvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4a.objects.collections.List*/ (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
 //BA.debugLineNum = 202;BA.debugLine="sv.ScrollViewInnerPanel.RemoveAllViews";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getScrollViewInnerPanel().RemoveAllViews();
 //BA.debugLineNum = 203;BA.debugLine="If TouchPanel.IsInitialized Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.IsInitialized()) { 
 //BA.debugLineNum = 204;BA.debugLine="sv.ScrollViewInnerPanel.AddView(TouchPanel, 0, 0";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getScrollViewInnerPanel().AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 };
 //BA.debugLineNum = 206;BA.debugLine="sv.ScrollViewInnerPanel.AddView(ForegroundImageVi";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getScrollViewInnerPanel().AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getObject()),(int) (0),(int) (0),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 207;BA.debugLine="If ExternalRuns.IsInitialized And ExternalRuns.Si";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.IsInitialized() && _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getSize()>0) { 
 //BA.debugLineNum = 208;BA.debugLine="Runs = ExternalRuns";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
 }else {
 //BA.debugLineNum = 210;BA.debugLine="Runs = mTextEngine.TagParser.CreateRuns(pe, Pars";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvv5._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*cm.jahswant.foodhunter.bbcodeparser*/ ._vvvvvvvvvvvvvvvvvvvvvvvvvv2 /*anywheresoftware.b4a.objects.collections.List*/ (_pe,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
 };
 //BA.debugLineNum = 213;BA.debugLine="Redraw";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4();
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4() throws Exception{
 //BA.debugLineNum = 216;BA.debugLine="Public Sub Redraw";
 //BA.debugLineNum = 217;BA.debugLine="Dim Style As BCParagraphStyle = mTextEngine.Creat";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvv5._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*cm.jahswant.foodhunter.bctextengine._bcparagraphstyle*/ ();
 //BA.debugLineNum = 218;BA.debugLine="Style.Padding = Padding";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/  = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6;
 //BA.debugLineNum = 219;BA.debugLine="Style.MaxWidth = mBase.Width";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.MaxWidth /*int*/  = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getWidth();
 //BA.debugLineNum = 220;BA.debugLine="Style.ResizeHeightAutomatically = True";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.ResizeHeightAutomatically /*boolean*/  = __c.True;
 //BA.debugLineNum = 221;BA.debugLine="Style.RTL = RTL";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.RTL /*boolean*/  = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
 //BA.debugLineNum = 222;BA.debugLine="URLToLines.Clear";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Clear();
 //BA.debugLineNum = 223;BA.debugLine="If LazyLoading Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) { 
 //BA.debugLineNum = 224;BA.debugLine="CleanExistingImageViews(False, UsedImageViews.Ke";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(__c.False,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2._getvvvvvvvvvvvvv2 /*anywheresoftware.b4a.objects.collections.List*/ (),(int) (0),(int) (0));
 //BA.debugLineNum = 225;BA.debugLine="UsedImageViews.Clear";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2._vvvvvvvvv6 /*String*/ ();
 //BA.debugLineNum = 226;BA.debugLine="Paragraph = mTextEngine.PrepareForLazyDrawing(Ru";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvv5._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*cm.jahswant.foodhunter.bctextengine._bcparagraph*/ (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5);
 //BA.debugLineNum = 227;BA.debugLine="ForegroundImageView.SetLayoutAnimated(0, Style.P";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.SetLayoutAnimated((int) (0),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getScrollViewContentWidth()-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getWidth()),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getScrollViewContentHeight()-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getHeight()));
 //BA.debugLineNum = 228;BA.debugLine="If AutoUnderlineURLs And ParseData.URLs.Size > 0";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 && _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.URLs /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
 //BA.debugLineNum = 229;BA.debugLine="CollectURLs";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
 };
 //BA.debugLineNum = 231;BA.debugLine="DrawVisibleRegion";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvv4();
 }else {
 //BA.debugLineNum = 233;BA.debugLine="Paragraph = mTextEngine.DrawText(Runs, Style, Fo";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvv5._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*cm.jahswant.foodhunter.bctextengine._bcparagraph*/ (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5);
 };
 //BA.debugLineNum = 235;BA.debugLine="If TouchPanel.IsInitialized Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.IsInitialized()) { 
 //BA.debugLineNum = 236;BA.debugLine="TouchPanel.SetLayoutAnimated(0, ForegroundImageV";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.SetLayoutAnimated((int) (0),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getLeft(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getTop(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getWidth(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getHeight());
 };
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(String _t) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Public Sub setText(t As String)";
 //BA.debugLineNum = 133;BA.debugLine="mText = t";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _t;
 //BA.debugLineNum = 134;BA.debugLine="ParseAndDraw";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3();
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(cm.jahswant.foodhunter.bctextengine _b) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Public Sub setTextEngine (b As BCTextEngine)";
 //BA.debugLineNum = 119;BA.debugLine="mTextEngine = b";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = _b;
 //BA.debugLineNum = 123;BA.debugLine="If mText <> \"\" Then";
if ((_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0).equals("") == false) { 
 //BA.debugLineNum = 124;BA.debugLine="setText(mText)";
_setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 };
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Public Sub setViews (m As Map)";
 //BA.debugLineNum = 56;BA.debugLine="ParseData.Views = m";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Views /*anywheresoftware.b4a.objects.collections.Map*/  = _m;
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public String  _sv_scrollchanged(int _position) throws Exception{
 //BA.debugLineNum = 339;BA.debugLine="Private Sub sv_ScrollChanged(Position As Int)";
 //BA.debugLineNum = 340;BA.debugLine="If LazyLoading Then DrawVisibleRegion";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) { 
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvv4();};
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return "";
}
public String  _touchpanel_touch(int _action,float _x,float _y) throws Exception{
cm.jahswant.foodhunter.bctextengine._bctextrun _run = null;
String _url = "";
 //BA.debugLineNum = 240;BA.debugLine="Private Sub TouchPanel_Touch (Action As Int, X As";
 //BA.debugLineNum = 241;BA.debugLine="Dim run As BCTextRun = Null";
_run = (cm.jahswant.foodhunter.bctextengine._bctextrun)(__c.Null);
 //BA.debugLineNum = 242;BA.debugLine="If URLToLines.Size > 0 Or Action = TouchPanel.TOU";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getSize()>0 || _action==_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.TOUCH_ACTION_UP) { 
 //BA.debugLineNum = 243;BA.debugLine="run = FindTouchedRun(X, Y)";
_run = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(_x,_y);
 };
 //BA.debugLineNum = 245;BA.debugLine="If run <> Null And ParseData.URLs.ContainsKey(run";
if (_run!= null && _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.URLs /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_run))) { 
 //BA.debugLineNum = 246;BA.debugLine="If Action = TouchPanel.TOUCH_ACTION_UP Then";
if (_action==_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.TOUCH_ACTION_UP) { 
 //BA.debugLineNum = 247;BA.debugLine="Dim url As String = ParseData.Urls.Get(run)";
_url = BA.ObjectToString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.URLs /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_run)));
 //BA.debugLineNum = 248;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_LinkC";
__c.CallSubDelayed2(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+"_LinkClicked",(Object)(_url));
 //BA.debugLineNum = 249;BA.debugLine="MarkURL(Null)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2((cm.jahswant.foodhunter.bctextengine._bctextrun)(__c.Null));
 }else if((_vvvvv0.getIsB4i() && _action==4) || (_vvvvv0.getIsB4A() && _action==3)) { 
 //BA.debugLineNum = 251;BA.debugLine="MarkURL(Null)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2((cm.jahswant.foodhunter.bctextengine._bctextrun)(__c.Null));
 }else {
 //BA.debugLineNum = 254;BA.debugLine="MarkURL(run)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(_run);
 };
 //BA.debugLineNum = 256;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 258;BA.debugLine="MarkURL(Null)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2((cm.jahswant.foodhunter.bctextengine._bctextrun)(__c.Null));
 //BA.debugLineNum = 259;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(int _offsety,int _height) throws Exception{
boolean _foundfirst = false;
anywheresoftware.b4a.objects.collections.List _existing = null;
cm.jahswant.foodhunter.bctextengine._bctextline _line = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv = null;
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
 //BA.debugLineNum = 147;BA.debugLine="Public Sub UpdateVisibleRegion (OffsetY As Int, He";
 //BA.debugLineNum = 148;BA.debugLine="Dim foundFirst As Boolean";
_foundfirst = false;
 //BA.debugLineNum = 149;BA.debugLine="Dim Existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 150;BA.debugLine="Existing.Initialize";
_existing.Initialize();
 //BA.debugLineNum = 151;BA.debugLine="Existing.AddAll(UsedImageViews.Keys)";
_existing.AddAll(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2._getvvvvvvvvvvvvv2 /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 152;BA.debugLine="CleanExistingImageViews(True, Existing, OffsetY,";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(__c.True,_existing,_offsety,_height);
 //BA.debugLineNum = 153;BA.debugLine="For Each Line As BCTextLine In Paragraph.TextLine";
{
final anywheresoftware.b4a.BA.IterableList group6 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_line = (cm.jahswant.foodhunter.bctextengine._bctextline)(group6.Get(index6));
 //BA.debugLineNum = 154;BA.debugLine="If LineIsVisible (Line, OffsetY, Height) Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(_line,_offsety,_height)) { 
 //BA.debugLineNum = 155;BA.debugLine="foundFirst = True";
_foundfirst = __c.True;
 //BA.debugLineNum = 156;BA.debugLine="If UsedImageViews.ContainsKey(Line) Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2._vvvvvvvvvvvv6 /*boolean*/ ((Object)(_line))) { 
 //BA.debugLineNum = 157;BA.debugLine="Continue";
if (true) continue;
 };
 //BA.debugLineNum = 159;BA.debugLine="Dim xiv As B4XView";
_xiv = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 160;BA.debugLine="If ImageViewsCache.Size = 0 Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getSize()==0) { 
 //BA.debugLineNum = 161;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 162;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
 //BA.debugLineNum = 163;BA.debugLine="xiv = iv";
_xiv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
 }else {
 //BA.debugLineNum = 165;BA.debugLine="xiv = ImageViewsCache.Get(ImageViewsCache.Size";
_xiv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.Get((int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getSize()-1))));
 //BA.debugLineNum = 166;BA.debugLine="ImageViewsCache.RemoveAt(ImageViewsCache.Size";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.RemoveAt((int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getSize()-1));
 };
 //BA.debugLineNum = 168;BA.debugLine="sv.ScrollViewInnerPanel.AddView(xiv, 0, 0, 0, 0";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getScrollViewInnerPanel().AddView((android.view.View)(_xiv.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 169;BA.debugLine="xiv.SendToBack";
_xiv.SendToBack();
 //BA.debugLineNum = 170;BA.debugLine="mTextEngine.DrawSingleLine(Line, xiv, Paragraph";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvv5._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 /*String*/ (_line,_xiv,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
 //BA.debugLineNum = 171;BA.debugLine="UsedImageViews.Put(Line, xiv)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2._vvvvvvvvvvvvv3 /*String*/ ((Object)(_line),(Object)(_xiv.getObject()));
 }else {
 //BA.debugLineNum = 173;BA.debugLine="If foundFirst Then Exit";
if (_foundfirst) { 
if (true) break;};
 };
 }
};
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "SETTEXTENGINE"))
	return _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1((cm.jahswant.foodhunter.bctextengine) args[0]);
return BA.SubDelegator.SubNotFound;
}
}

package cm.jahswant.foodhunter.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_action_bar{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("actoolbarlight1").vw.setWidth((int)((100d / 100 * width)));
if ((anywheresoftware.b4a.keywords.LayoutBuilder.getScreenSize()>6.5d)) { 
;
views.get("actoolbarlight1").vw.setHeight((int)((64d * scale)));
;}else{ 
;
if ((BA.ObjectToBoolean( String.valueOf(anywheresoftware.b4a.keywords.LayoutBuilder.isPortrait())))) { 
;
views.get("actoolbarlight1").vw.setHeight((int)((56d * scale)));
;}else{ 
;
views.get("actoolbarlight1").vw.setHeight((int)((48d * scale)));
;};
;};
views.get("pnlcontent").vw.setTop((int)((views.get("actoolbarlight1").vw.getTop() + views.get("actoolbarlight1").vw.getHeight())));
views.get("pnlcontent").vw.setLeft((int)((0d * scale)));
views.get("pnlcontent").vw.setWidth((int)((100d / 100 * width)));
views.get("pnlcontent").vw.setHeight((int)((93d / 100 * height)-(views.get("actoolbarlight1").vw.getHeight())));
//BA.debugLineNum = 20;BA.debugLine="BottomWobbleMenu.Top = PnlContent.Bottom"[action_bar/General script]
views.get("bottomwobblemenu").vw.setTop((int)((views.get("pnlcontent").vw.getTop() + views.get("pnlcontent").vw.getHeight())));
//BA.debugLineNum = 21;BA.debugLine="BottomWobbleMenu.Left = 0dip"[action_bar/General script]
views.get("bottomwobblemenu").vw.setLeft((int)((0d * scale)));
//BA.debugLineNum = 22;BA.debugLine="BottomWobbleMenu.Width = 100%x"[action_bar/General script]
views.get("bottomwobblemenu").vw.setWidth((int)((100d / 100 * width)));
//BA.debugLineNum = 23;BA.debugLine="BottomWobbleMenu.Height = 7%Y"[action_bar/General script]
views.get("bottomwobblemenu").vw.setHeight((int)((7d / 100 * height)));

}
}
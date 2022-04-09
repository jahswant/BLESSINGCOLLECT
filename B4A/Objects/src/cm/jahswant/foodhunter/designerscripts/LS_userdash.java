package cm.jahswant.foodhunter.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_userdash{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("customlistvieworders").vw.setLeft((int)((1d / 100 * width)));
views.get("customlistvieworders").vw.setWidth((int)((99d / 100 * width) - ((1d / 100 * width))));
views.get("customlistvieworders").vw.setTop((int)((18d / 100 * height)));
views.get("customlistvieworders").vw.setHeight((int)((99d / 100 * height) - ((18d / 100 * height))));
views.get("menusignuser").vw.setLeft((int)((2d / 100 * width)));
views.get("menusignuser").vw.setWidth((int)((98d / 100 * width) - ((2d / 100 * width))));
views.get("menusignuser").vw.setTop((int)((1d / 100 * height)));
views.get("menusignuser").vw.setHeight((int)((17d / 100 * height) - ((1d / 100 * height))));
views.get("imglogout").vw.setLeft((int)((84d / 100 * width)));
views.get("imglogout").vw.setWidth((int)((95d / 100 * width) - ((84d / 100 * width))));
views.get("imglogout").vw.setTop((int)((1d / 100 * height)));
views.get("imglogout").vw.setHeight((int)((8d / 100 * height) - ((1d / 100 * height))));
views.get("imageviewprofile").vw.setLeft((int)((84d / 100 * width)));
views.get("imageviewprofile").vw.setWidth((int)((95d / 100 * width) - ((84d / 100 * width))));
views.get("imageviewprofile").vw.setTop((int)((8d / 100 * height)));
views.get("imageviewprofile").vw.setHeight((int)((15d / 100 * height) - ((8d / 100 * height))));
views.get("imglogoutpnl").vw.setLeft((int)((84d / 100 * width)));
views.get("imglogoutpnl").vw.setWidth((int)((95d / 100 * width) - ((84d / 100 * width))));
views.get("imglogoutpnl").vw.setTop((int)((1d / 100 * height)));
views.get("imglogoutpnl").vw.setHeight((int)((8d / 100 * height) - ((1d / 100 * height))));
views.get("imageviewprofilepnl").vw.setLeft((int)((84d / 100 * width)));
views.get("imageviewprofilepnl").vw.setWidth((int)((95d / 100 * width) - ((84d / 100 * width))));
views.get("imageviewprofilepnl").vw.setTop((int)((8d / 100 * height)));
views.get("imageviewprofilepnl").vw.setHeight((int)((15d / 100 * height) - ((8d / 100 * height))));
views.get("imgprofile").vw.setLeft((int)((2d / 100 * width)));
views.get("imgprofile").vw.setWidth((int)((25d / 100 * width) - ((2d / 100 * width))));
views.get("imgprofile").vw.setTop((int)((1d / 100 * height)));
views.get("imgprofile").vw.setHeight((int)((15d / 100 * height) - ((1d / 100 * height))));
views.get("lblfullnames").vw.setLeft((int)((26d / 100 * width)));
views.get("lblfullnames").vw.setWidth((int)((83d / 100 * width) - ((26d / 100 * width))));
views.get("lblfullnames").vw.setTop((int)((1d / 100 * height)));
views.get("lblfullnames").vw.setHeight((int)((8d / 100 * height) - ((1d / 100 * height))));
//BA.debugLineNum = 29;BA.debugLine="lblStatus.SetLeftAndRight(26%x,83%x)"[userdash/General script]
views.get("lblstatus").vw.setLeft((int)((26d / 100 * width)));
views.get("lblstatus").vw.setWidth((int)((83d / 100 * width) - ((26d / 100 * width))));
//BA.debugLineNum = 30;BA.debugLine="lblStatus.SetTopAndBottom(8%y,15%y)"[userdash/General script]
views.get("lblstatus").vw.setTop((int)((8d / 100 * height)));
views.get("lblstatus").vw.setHeight((int)((15d / 100 * height) - ((8d / 100 * height))));

}
}
package cm.jahswant.foodhunter.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_daysitem{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("basepanel").vw.setLeft((int)((0d / 100 * width)));
views.get("basepanel").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("basepanel").vw.setTop((int)((0d / 100 * height)));
views.get("basepanel").vw.setHeight((int)((100d / 100 * height) - ((0d / 100 * height))));
views.get("lbldayname").vw.setLeft((int)((10d / 100 * width)));
views.get("lbldayname").vw.setWidth((int)((90d / 100 * width) - ((10d / 100 * width))));
views.get("lbldayname").vw.setTop((int)((1d / 100 * height)));
views.get("lbldayname").vw.setHeight((int)((30d / 100 * height) - ((1d / 100 * height))));
views.get("panelline").vw.setLeft((int)((2d / 100 * width)));
views.get("panelline").vw.setWidth((int)((98d / 100 * width) - ((2d / 100 * width))));
views.get("panelline").vw.setTop((int)((31d / 100 * height)));
views.get("panelline").vw.setHeight((int)((32d / 100 * height) - ((31d / 100 * height))));
views.get("lblmorning").vw.setLeft((int)((5d / 100 * width)));
views.get("lblmorning").vw.setWidth((int)((45d / 100 * width) - ((5d / 100 * width))));
views.get("lblmorning").vw.setTop((int)((33d / 100 * height)));
views.get("lblmorning").vw.setHeight((int)((69d / 100 * height) - ((33d / 100 * height))));
views.get("lblmorningcollect").vw.setLeft((int)((5d / 100 * width)));
views.get("lblmorningcollect").vw.setWidth((int)((45d / 100 * width) - ((5d / 100 * width))));
views.get("lblmorningcollect").vw.setTop((int)((70d / 100 * height)));
views.get("lblmorningcollect").vw.setHeight((int)((99d / 100 * height) - ((70d / 100 * height))));
views.get("lblafternoon").vw.setLeft((int)((55d / 100 * width)));
views.get("lblafternoon").vw.setWidth((int)((95d / 100 * width) - ((55d / 100 * width))));
views.get("lblafternoon").vw.setTop((int)((33d / 100 * height)));
views.get("lblafternoon").vw.setHeight((int)((69d / 100 * height) - ((33d / 100 * height))));
views.get("lblafternooncollect").vw.setLeft((int)((55d / 100 * width)));
views.get("lblafternooncollect").vw.setWidth((int)((95d / 100 * width) - ((55d / 100 * width))));
views.get("lblafternooncollect").vw.setTop((int)((70d / 100 * height)));
views.get("lblafternooncollect").vw.setHeight((int)((99d / 100 * height) - ((70d / 100 * height))));

}
}
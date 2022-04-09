package cm.jahswant.foodhunter.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_choosetrajet{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("basepanel").vw.setLeft((int)((0d / 100 * width)));
views.get("basepanel").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("basepanel").vw.setTop((int)((0d / 100 * height)));
views.get("basepanel").vw.setHeight((int)((100d / 100 * height) - ((0d / 100 * height))));
views.get("lbltrajetname").vw.setLeft((int)((2d / 100 * width)));
views.get("lbltrajetname").vw.setWidth((int)((99d / 100 * width) - ((2d / 100 * width))));
views.get("lbltrajetname").vw.setTop((int)((1d / 100 * height)));
views.get("lbltrajetname").vw.setHeight((int)((55d / 100 * height) - ((1d / 100 * height))));
views.get("panelline").vw.setLeft((int)((2d / 100 * width)));
views.get("panelline").vw.setWidth((int)((98d / 100 * width) - ((2d / 100 * width))));
views.get("panelline").vw.setTop((int)((55d / 100 * height)));
views.get("panelline").vw.setHeight((int)((56d / 100 * height) - ((55d / 100 * height))));
views.get("lblcamioncollect").vw.setLeft((int)((2d / 100 * width)));
views.get("lblcamioncollect").vw.setWidth((int)((45d / 100 * width) - ((2d / 100 * width))));
views.get("lblcamioncollect").vw.setTop((int)((57d / 100 * height)));
views.get("lblcamioncollect").vw.setHeight((int)((99d / 100 * height) - ((57d / 100 * height))));
views.get("checkboxcollect").vw.setLeft((int)((85d / 100 * width)));
views.get("checkboxcollect").vw.setWidth((int)((99d / 100 * width) - ((85d / 100 * width))));
views.get("checkboxcollect").vw.setTop((int)((57d / 100 * height)));
views.get("checkboxcollect").vw.setHeight((int)((99d / 100 * height) - ((57d / 100 * height))));

}
}
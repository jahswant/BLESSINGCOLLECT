package cm.jahswant.foodhunter.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_selecttrajet{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("lbltitile").vw.setLeft((int)((0d / 100 * width)));
views.get("lbltitile").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("lbltitile").vw.setTop((int)((0d / 100 * height)));
views.get("lbltitile").vw.setHeight((int)((10d / 100 * height) - ((0d / 100 * height))));
views.get("metrouitextviewsearch").vw.setLeft((int)((1d / 100 * width)));
views.get("metrouitextviewsearch").vw.setWidth((int)((99d / 100 * width) - ((1d / 100 * width))));
views.get("metrouitextviewsearch").vw.setTop((int)((11d / 100 * height)));
views.get("metrouitextviewsearch").vw.setHeight((int)((21d / 100 * height) - ((11d / 100 * height))));
views.get("customlistviewtrajets").vw.setLeft((int)((0d / 100 * width)));
views.get("customlistviewtrajets").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("customlistviewtrajets").vw.setTop((int)((22d / 100 * height)));
views.get("customlistviewtrajets").vw.setHeight((int)((100d / 100 * height) - ((22d / 100 * height))));

}
}
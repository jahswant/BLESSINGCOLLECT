package cm.jahswant.foodhunter.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_splash{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("psplash").vw.setLeft((int)((0d / 100 * width)));
views.get("psplash").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("psplash").vw.setTop((int)((0d / 100 * height)));
views.get("psplash").vw.setHeight((int)((100d / 100 * height) - ((0d / 100 * height))));
views.get("imgsplash").vw.setLeft((int)((10d / 100 * width)));
views.get("imgsplash").vw.setWidth((int)((90d / 100 * width) - ((10d / 100 * width))));
views.get("imgsplash").vw.setTop((int)((45d / 100 * height)));
views.get("imgsplash").vw.setHeight((int)((55d / 100 * height) - ((45d / 100 * height))));

}
}
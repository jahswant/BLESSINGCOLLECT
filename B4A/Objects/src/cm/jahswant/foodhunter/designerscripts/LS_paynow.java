package cm.jahswant.foodhunter.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_paynow{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panelback").vw.setLeft((int)((0d / 100 * width)));
views.get("panelback").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panelback").vw.setTop((int)((0d / 100 * height)));
views.get("panelback").vw.setHeight((int)((100d / 100 * height) - ((0d / 100 * height))));
views.get("panel2").vw.setLeft((int)((0d / 100 * width)));
views.get("panel2").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panel2").vw.setTop((int)((0d / 100 * height)));
views.get("panel2").vw.setHeight((int)((20d / 100 * height) - ((0d / 100 * height))));
views.get("pnlcancel").vw.setLeft((int)((85d / 100 * width)));
views.get("pnlcancel").vw.setWidth((int)((100d / 100 * width) - ((85d / 100 * width))));
views.get("pnlcancel").vw.setTop((int)((0d / 100 * height)));
views.get("pnlcancel").vw.setHeight((int)((20d / 100 * height) - ((0d / 100 * height))));
views.get("imgcancelme").vw.setLeft((int)((85d / 100 * width)));
views.get("imgcancelme").vw.setWidth((int)((100d / 100 * width) - ((85d / 100 * width))));
views.get("imgcancelme").vw.setTop((int)((1d / 100 * height)));
views.get("imgcancelme").vw.setHeight((int)((19d / 100 * height) - ((1d / 100 * height))));
views.get("lblheadertext").vw.setLeft((int)((1d / 100 * width)));
views.get("lblheadertext").vw.setWidth((int)((85d / 100 * width) - ((1d / 100 * width))));
views.get("lblheadertext").vw.setTop((int)((1d / 100 * height)));
views.get("lblheadertext").vw.setHeight((int)((19d / 100 * height) - ((1d / 100 * height))));
views.get("b4ximageviewlogo").vw.setLeft((int)((2d / 100 * width)));
views.get("b4ximageviewlogo").vw.setWidth((int)((98d / 100 * width) - ((2d / 100 * width))));
views.get("b4ximageviewlogo").vw.setTop((int)((21d / 100 * height)));
views.get("b4ximageviewlogo").vw.setHeight((int)((58d / 100 * height) - ((21d / 100 * height))));
views.get("txtmomotelephone").vw.setLeft((int)((3d / 100 * width)));
views.get("txtmomotelephone").vw.setWidth((int)((97d / 100 * width) - ((3d / 100 * width))));
views.get("txtmomotelephone").vw.setTop((int)((60d / 100 * height)));
views.get("txtmomotelephone").vw.setHeight((int)((78d / 100 * height) - ((60d / 100 * height))));
views.get("btnpay").vw.setLeft((int)((2d / 100 * width)));
views.get("btnpay").vw.setWidth((int)((98d / 100 * width) - ((2d / 100 * width))));
views.get("btnpay").vw.setTop((int)((79d / 100 * height)));
views.get("btnpay").vw.setHeight((int)((97d / 100 * height) - ((79d / 100 * height))));

}
}
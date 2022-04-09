package cm.jahswant.foodhunter.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_aboutlayout{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[aboutlayout/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 4;BA.debugLine="pnlC.SetLeftAndRight(0%x,100%x)"[aboutlayout/General script]
views.get("pnlc").vw.setLeft((int)((0d / 100 * width)));
views.get("pnlc").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 5;BA.debugLine="pnlC.SetTopAndBottom(0%y,100%y)"[aboutlayout/General script]
views.get("pnlc").vw.setTop((int)((0d / 100 * height)));
views.get("pnlc").vw.setHeight((int)((100d / 100 * height) - ((0d / 100 * height))));
//BA.debugLineNum = 7;BA.debugLine="imgLogoS.SetLeftAndRight(30%x,70%x)"[aboutlayout/General script]
views.get("imglogos").vw.setLeft((int)((30d / 100 * width)));
views.get("imglogos").vw.setWidth((int)((70d / 100 * width) - ((30d / 100 * width))));
//BA.debugLineNum = 8;BA.debugLine="imgLogoS.SetTopAndBottom(25%y,40%y)"[aboutlayout/General script]
views.get("imglogos").vw.setTop((int)((25d / 100 * height)));
views.get("imglogos").vw.setHeight((int)((40d / 100 * height) - ((25d / 100 * height))));
//BA.debugLineNum = 10;BA.debugLine="lblName.SetLeftAndRight(20%x,80%x)"[aboutlayout/General script]
views.get("lblname").vw.setLeft((int)((20d / 100 * width)));
views.get("lblname").vw.setWidth((int)((80d / 100 * width) - ((20d / 100 * width))));
//BA.debugLineNum = 11;BA.debugLine="lblName.SetTopAndBottom(45%y,55%y)"[aboutlayout/General script]
views.get("lblname").vw.setTop((int)((45d / 100 * height)));
views.get("lblname").vw.setHeight((int)((55d / 100 * height) - ((45d / 100 * height))));
//BA.debugLineNum = 13;BA.debugLine="lblVersion.SetLeftAndRight(20%x,80%x)"[aboutlayout/General script]
views.get("lblversion").vw.setLeft((int)((20d / 100 * width)));
views.get("lblversion").vw.setWidth((int)((80d / 100 * width) - ((20d / 100 * width))));
//BA.debugLineNum = 14;BA.debugLine="lblVersion.SetTopAndBottom(55%y,65%y)"[aboutlayout/General script]
views.get("lblversion").vw.setTop((int)((55d / 100 * height)));
views.get("lblversion").vw.setHeight((int)((65d / 100 * height) - ((55d / 100 * height))));
//BA.debugLineNum = 16;BA.debugLine="lblCopyright.SetLeftAndRight(10%x,90%x)"[aboutlayout/General script]
views.get("lblcopyright").vw.setLeft((int)((10d / 100 * width)));
views.get("lblcopyright").vw.setWidth((int)((90d / 100 * width) - ((10d / 100 * width))));
//BA.debugLineNum = 17;BA.debugLine="lblCopyright.SetTopAndBottom(65%y,75%y)"[aboutlayout/General script]
views.get("lblcopyright").vw.setTop((int)((65d / 100 * height)));
views.get("lblcopyright").vw.setHeight((int)((75d / 100 * height) - ((65d / 100 * height))));
//BA.debugLineNum = 19;BA.debugLine="lblAllRights.SetLeftAndRight(1%x,99%x)"[aboutlayout/General script]
views.get("lblallrights").vw.setLeft((int)((1d / 100 * width)));
views.get("lblallrights").vw.setWidth((int)((99d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 20;BA.debugLine="lblAllRights.SetTopAndBottom(75%y,85%y)"[aboutlayout/General script]
views.get("lblallrights").vw.setTop((int)((75d / 100 * height)));
views.get("lblallrights").vw.setHeight((int)((85d / 100 * height) - ((75d / 100 * height))));
//BA.debugLineNum = 22;BA.debugLine="lblWebsite.SetLeftAndRight(1%x,99%x)"[aboutlayout/General script]
views.get("lblwebsite").vw.setLeft((int)((1d / 100 * width)));
views.get("lblwebsite").vw.setWidth((int)((99d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 23;BA.debugLine="lblWebsite.SetTopAndBottom(85%y,95%y)"[aboutlayout/General script]
views.get("lblwebsite").vw.setTop((int)((85d / 100 * height)));
views.get("lblwebsite").vw.setHeight((int)((95d / 100 * height) - ((85d / 100 * height))));

}
}
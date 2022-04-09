package cm.jahswant.foodhunter;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class bctoast extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "cm.jahswant.foodhunter.bctoast");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", cm.jahswant.foodhunter.bctoast.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvv0 = null;
public int _vvvvvvvvvvvvvvvvvvvv5 = 0;
public cm.jahswant.foodhunter.bblabel _bb1 = null;
public cm.jahswant.foodhunter.bctextengine _vvvvvvvvvvvvvvvvvvvv6 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvv7 = null;
public int _vvvvvvvvvvvvvvvvvvvv0 = 0;
public int _vvvvvvvvvvvvvvvvvvvvv1 = 0;
public int _vvvvvvvvvvvvvvvvvvvvv2 = 0;
public int _vvvvvvvvvvvvvvvvvvvvv3 = 0;
public int _vvvvvvvvvvvvvvvvvvvvv4 = 0;
public int _vvvvvvvvvvvvvvvvvvvvv5 = 0;
public b4a.example.dateutils _vvvvvv0 = null;
public cm.jahswant.foodhunter.main _vvvvvvv1 = null;
public cm.jahswant.foodhunter.utils _vvvvvvv2 = null;
public cm.jahswant.foodhunter.starter _vvvvvvv3 = null;
public cm.jahswant.foodhunter.b4xpages _vvvvvvv4 = null;
public cm.jahswant.foodhunter.b4xcollections _vvvvvvv5 = null;
public cm.jahswant.foodhunter.httputils2service _vvvvvvv6 = null;
public cm.jahswant.foodhunter.xuiviewsutils _vvvvvvv7 = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public pnl As B4XView";
_vvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI";
_vvvvv0 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Private ShowIndex As Int";
_vvvvvvvvvvvvvvvvvvvv5 = 0;
 //BA.debugLineNum = 5;BA.debugLine="Public BB1 As BBLabel";
_bb1 = new cm.jahswant.foodhunter.bblabel();
 //BA.debugLineNum = 6;BA.debugLine="Private te As BCTextEngine";
_vvvvvvvvvvvvvvvvvvvv6 = new cm.jahswant.foodhunter.bctextengine();
 //BA.debugLineNum = 7;BA.debugLine="Private iv As B4XView";
_vvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Public DurationMs As Int = 3000";
_vvvvvvvvvvvvvvvvvvvv0 = (int) (3000);
 //BA.debugLineNum = 9;BA.debugLine="Public DefaultTextColor As Int = 0xFF3E3E3E";
_vvvvvvvvvvvvvvvvvvvvv1 = ((int)0xff3e3e3e);
 //BA.debugLineNum = 10;BA.debugLine="Public PaddingSides As Int = 15dip";
_vvvvvvvvvvvvvvvvvvvvv2 = __c.DipToCurrent((int) (15));
 //BA.debugLineNum = 11;BA.debugLine="Public PaddingTopBottom As Int = 10dip";
_vvvvvvvvvvvvvvvvvvvvv3 = __c.DipToCurrent((int) (10));
 //BA.debugLineNum = 12;BA.debugLine="Public MaxHeight As Int = 100dip";
_vvvvvvvvvvvvvvvvvvvvv4 = __c.DipToCurrent((int) (100));
 //BA.debugLineNum = 13;BA.debugLine="Public VerticalCenterPercentage As Int = 85";
_vvvvvvvvvvvvvvvvvvvvv5 = (int) (85);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4a.objects.PanelWrapper _p = null;
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize (Parent As B4XView)";
 //BA.debugLineNum = 17;BA.debugLine="pnl = xui.CreatePanel(\"\")";
_vvvvvvvvvvvvvvvvvvvv4 = _vvvvv0.CreatePanel(ba,"");
 //BA.debugLineNum = 18;BA.debugLine="Parent.AddView(pnl, 0, 0, Parent.Width - 30dip, M";
_parent.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvv4.getObject()),(int) (0),(int) (0),(int) (_parent.getWidth()-__c.DipToCurrent((int) (30))),_vvvvvvvvvvvvvvvvvvvvv4);
 //BA.debugLineNum = 19;BA.debugLine="pnl.LoadLayout(\"BCToast\")";
_vvvvvvvvvvvvvvvvvvvv4.LoadLayout("BCToast",ba);
 //BA.debugLineNum = 20;BA.debugLine="pnl.SetColorAndBorder(0xFFC3C3C3, 0dip, xui.Color";
_vvvvvvvvvvvvvvvvvvvv4.SetColorAndBorder(((int)0xffc3c3c3),__c.DipToCurrent((int) (0)),_vvvvv0.Color_White,__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 21;BA.debugLine="pnl.Visible = False";
_vvvvvvvvvvvvvvvvvvvv4.setVisible(__c.False);
 //BA.debugLineNum = 22;BA.debugLine="te.Initialize(pnl)";
_vvvvvvvvvvvvvvvvvvvv6._initialize /*String*/ (ba,_vvvvvvvvvvvvvvvvvvvv4);
 //BA.debugLineNum = 23;BA.debugLine="iv = BB1.mBase.GetView(0)";
_vvvvvvvvvvvvvvvvvvvv7 = _bb1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
 //BA.debugLineNum = 24;BA.debugLine="iv.RemoveViewFromParent";
_vvvvvvvvvvvvvvvvvvvv7.RemoveViewFromParent();
 //BA.debugLineNum = 25;BA.debugLine="BB1.DisableResizeEvent = True";
_bb1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/  = __c.True;
 //BA.debugLineNum = 27;BA.debugLine="Dim p As Panel = pnl";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_vvvvvvvvvvvvvvvvvvvv4.getObject()));
 //BA.debugLineNum = 28;BA.debugLine="p.Elevation = 5dip";
_p.setElevation((float) (__c.DipToCurrent((int) (5))));
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public void  _show(String _message) throws Exception{
ResumableSub_Show rsub = new ResumableSub_Show(this,_message);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(cm.jahswant.foodhunter.bctoast parent,String _message) {
this.parent = parent;
this._message = _message;
}
cm.jahswant.foodhunter.bctoast parent;
String _message;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
int _w = 0;
int _h = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _parent = null;
int _newleft = 0;
int _dx = 0;
int _dy = 0;
int _myindex = 0;
anywheresoftware.b4a.BA.IterableList group3;
int index3;
int groupLen3;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 34;BA.debugLine="BB1.ParseData.DefaultColor = DefaultTextColor";
parent._bb1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*cm.jahswant.foodhunter.bbcodeparser._bbcodeparsedata*/ .DefaultColor /*int*/  = parent._vvvvvvvvvvvvvvvvvvvvv1;
 //BA.debugLineNum = 35;BA.debugLine="iv.RemoveViewFromParent";
parent._vvvvvvvvvvvvvvvvvvvv7.RemoveViewFromParent();
 //BA.debugLineNum = 36;BA.debugLine="For Each v As B4XView In pnl.GetAllViewsRecursive";
if (true) break;

case 1:
//for
this.state = 10;
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
group3 = parent._vvvvvvvvvvvvvvvvvvvv4.GetAllViewsRecursive();
index3 = 0;
groupLen3 = group3.getSize();
this.state = 19;
if (true) break;

case 19:
//C
this.state = 10;
if (index3 < groupLen3) {
this.state = 3;
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group3.Get(index3)));}
if (true) break;

case 20:
//C
this.state = 19;
index3++;
if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 37;BA.debugLine="If v.Tag = \"to remove\" Then v.RemoveViewFromPare";
if (true) break;

case 4:
//if
this.state = 9;
if ((_v.getTag()).equals((Object)("to remove"))) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
_v.RemoveViewFromParent();
if (true) break;

case 9:
//C
this.state = 20;
;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 39;BA.debugLine="pnl.Width = pnl.Parent.Width - 2 * PaddingSides";
parent._vvvvvvvvvvvvvvvvvvvv4.setWidth((int) (parent._vvvvvvvvvvvvvvvvvvvv4.getParent().getWidth()-2*parent._vvvvvvvvvvvvvvvvvvvvv2));
 //BA.debugLineNum = 40;BA.debugLine="pnl.Height = MaxHeight";
parent._vvvvvvvvvvvvvvvvvvvv4.setHeight(parent._vvvvvvvvvvvvvvvvvvvvv4);
 //BA.debugLineNum = 41;BA.debugLine="BB1.mBase.Width = pnl.Width";
parent._bb1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(parent._vvvvvvvvvvvvvvvvvvvv4.getWidth());
 //BA.debugLineNum = 42;BA.debugLine="BB1.mBase.Height = pnl.Height";
parent._bb1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(parent._vvvvvvvvvvvvvvvvvvvv4.getHeight());
 //BA.debugLineNum = 43;BA.debugLine="BB1.mBase.AddView(iv, 0, 0, BB1.mBase.Width, BB1.";
parent._bb1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(parent._vvvvvvvvvvvvvvvvvvvv7.getObject()),(int) (0),(int) (0),parent._bb1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),parent._bb1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 //BA.debugLineNum = 44;BA.debugLine="BB1.Text = Message";
parent._bb1._setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*String*/ (_message);
 //BA.debugLineNum = 45;BA.debugLine="Dim iv As B4XView = BB1.mBase.GetView(0)";
parent._vvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.B4XViewWrapper();
parent._vvvvvvvvvvvvvvvvvvvv7 = parent._bb1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
 //BA.debugLineNum = 46;BA.debugLine="iv.RemoveViewFromParent";
parent._vvvvvvvvvvvvvvvvvvvv7.RemoveViewFromParent();
 //BA.debugLineNum = 47;BA.debugLine="Dim w As Int = iv.Width + 2 * PaddingSides";
_w = (int) (parent._vvvvvvvvvvvvvvvvvvvv7.getWidth()+2*parent._vvvvvvvvvvvvvvvvvvvvv2);
 //BA.debugLineNum = 48;BA.debugLine="Dim h As Int = iv.Height + 2 * PaddingTopBottom";
_h = (int) (parent._vvvvvvvvvvvvvvvvvvvv7.getHeight()+2*parent._vvvvvvvvvvvvvvvvvvvvv3);
 //BA.debugLineNum = 49;BA.debugLine="Dim Parent As B4XView = pnl.Parent";
_parent = new anywheresoftware.b4a.objects.B4XViewWrapper();
_parent = parent._vvvvvvvvvvvvvvvvvvvv4.getParent();
 //BA.debugLineNum = 50;BA.debugLine="Dim NewLeft As Int = Parent.Width / 2 - w / 2";
_newleft = (int) (_parent.getWidth()/(double)2-_w/(double)2);
 //BA.debugLineNum = 51;BA.debugLine="pnl.SetLayoutAnimated(0, NewLeft, Parent.Height *";
parent._vvvvvvvvvvvvvvvvvvvv4.SetLayoutAnimated((int) (0),_newleft,(int) (_parent.getHeight()*parent._vvvvvvvvvvvvvvvvvvvvv5/(double)100-_h/(double)2),_w,_h);
 //BA.debugLineNum = 52;BA.debugLine="pnl.BringToFront";
parent._vvvvvvvvvvvvvvvvvvvv4.BringToFront();
 //BA.debugLineNum = 53;BA.debugLine="Dim dx As Int = PaddingSides - iv.Left";
_dx = (int) (parent._vvvvvvvvvvvvvvvvvvvvv2-parent._vvvvvvvvvvvvvvvvvvvv7.getLeft());
 //BA.debugLineNum = 54;BA.debugLine="Dim dy As Int = PaddingTopBottom - iv.Top";
_dy = (int) (parent._vvvvvvvvvvvvvvvvvvvvv3-parent._vvvvvvvvvvvvvvvvvvvv7.getTop());
 //BA.debugLineNum = 55;BA.debugLine="pnl.AddView(iv, PaddingSides, PaddingTopBottom, i";
parent._vvvvvvvvvvvvvvvvvvvv4.AddView((android.view.View)(parent._vvvvvvvvvvvvvvvvvvvv7.getObject()),parent._vvvvvvvvvvvvvvvvvvvvv2,parent._vvvvvvvvvvvvvvvvvvvvv3,parent._vvvvvvvvvvvvvvvvvvvv7.getWidth(),parent._vvvvvvvvvvvvvvvvvvvv7.getHeight());
 //BA.debugLineNum = 57;BA.debugLine="Do While BB1.mBase.NumberOfViews > 0";
if (true) break;

case 11:
//do while
this.state = 14;
while (parent._bb1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()>0) {
this.state = 13;
if (true) break;
}
if (true) break;

case 13:
//C
this.state = 11;
 //BA.debugLineNum = 58;BA.debugLine="Dim v As B4XView = BB1.mBase.GetView(0)";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = parent._bb1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
 //BA.debugLineNum = 59;BA.debugLine="v.RemoveViewFromParent";
_v.RemoveViewFromParent();
 //BA.debugLineNum = 60;BA.debugLine="v.Tag = \"to remove\"";
_v.setTag((Object)("to remove"));
 //BA.debugLineNum = 61;BA.debugLine="pnl.AddView(v, dx + v.Left, dy + v.Top, v.Width,";
parent._vvvvvvvvvvvvvvvvvvvv4.AddView((android.view.View)(_v.getObject()),(int) (_dx+_v.getLeft()),(int) (_dy+_v.getTop()),_v.getWidth(),_v.getHeight());
 if (true) break;

case 14:
//C
this.state = 15;
;
 //BA.debugLineNum = 63;BA.debugLine="pnl.SetVisibleAnimated(200, True)";
parent._vvvvvvvvvvvvvvvvvvvv4.SetVisibleAnimated((int) (200),parent.__c.True);
 //BA.debugLineNum = 64;BA.debugLine="ShowIndex = ShowIndex + 1";
parent._vvvvvvvvvvvvvvvvvvvv5 = (int) (parent._vvvvvvvvvvvvvvvvvvvv5+1);
 //BA.debugLineNum = 65;BA.debugLine="Dim MyIndex As Int = ShowIndex";
_myindex = parent._vvvvvvvvvvvvvvvvvvvv5;
 //BA.debugLineNum = 66;BA.debugLine="Sleep(DurationMs)";
parent.__c.Sleep(ba,this,parent._vvvvvvvvvvvvvvvvvvvv0);
this.state = 21;
return;
case 21:
//C
this.state = 15;
;
 //BA.debugLineNum = 67;BA.debugLine="If MyIndex = ShowIndex Then";
if (true) break;

case 15:
//if
this.state = 18;
if (_myindex==parent._vvvvvvvvvvvvvvvvvvvv5) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 68;BA.debugLine="pnl.SetVisibleAnimated(200, False)";
parent._vvvvvvvvvvvvvvvvvvvv4.SetVisibleAnimated((int) (200),parent.__c.False);
 if (true) break;

case 18:
//C
this.state = -1;
;
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}

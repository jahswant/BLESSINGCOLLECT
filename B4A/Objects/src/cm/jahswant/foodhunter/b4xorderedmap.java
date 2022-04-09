package cm.jahswant.foodhunter;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xorderedmap extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "cm.jahswant.foodhunter.b4xorderedmap");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", cm.jahswant.foodhunter.b4xorderedmap.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvv6 = null;
public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvv7 = null;
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
 //BA.debugLineNum = 2;BA.debugLine="Private map As Map";
_vvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 3;BA.debugLine="Private list As List";
_vvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvv6() throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Public Sub Clear";
 //BA.debugLineNum = 27;BA.debugLine="list.Clear";
_vvvvvvvvvvvvvvv7.Clear();
 //BA.debugLineNum = 28;BA.debugLine="map.Clear";
_vvvvvvvvvvvvvvv6.Clear();
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public boolean  _vvvvvvvvvvvv6(Object _key) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Public Sub ContainsKey (Key As Object) As Boolean";
 //BA.debugLineNum = 47;BA.debugLine="Return map.ContainsKey(Key)";
if (true) return _vvvvvvvvvvvvvvv6.ContainsKey(_key);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return false;
}
public Object  _vvvvvvvvv7(Object _key) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Public Sub Get (Key As Object) As Object";
 //BA.debugLineNum = 38;BA.debugLine="Return map.Get(Key)";
if (true) return _vvvvvvvvvvvvvvv6.Get(_key);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public Object  _vvvvvvvvvvvvvv0() throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Public Sub GetDataForSerializator As Object";
 //BA.debugLineNum = 66;BA.debugLine="Return Array(map, list)";
if (true) return (Object)(new Object[]{(Object)(_vvvvvvvvvvvvvvv6.getObject()),(Object)(_vvvvvvvvvvvvvvv7.getObject())});
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public Object  _vvvvvvvvvvvvvvv1(Object _key,Object _defaultvalue) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Public Sub GetDefault (Key As Object, DefaultValue";
 //BA.debugLineNum = 43;BA.debugLine="Return map.GetDefault(Key, DefaultValue)";
if (true) return _vvvvvvvvvvvvvvv6.GetDefault(_key,_defaultvalue);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getvvvvvvvvvvvvv2() throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Public Sub getKeys As List";
 //BA.debugLineNum = 33;BA.debugLine="Return list";
if (true) return _vvvvvvvvvvvvvvv7;
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public int  _getvvvvvvvvvv2() throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Public Sub getSize As Int";
 //BA.debugLineNum = 51;BA.debugLine="Return map.Size";
if (true) return _vvvvvvvvvvvvvvv6.getSize();
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.List  _getvvvvvvvvvvvvvvv5() throws Exception{
anywheresoftware.b4a.objects.collections.List _res = null;
Object _key = null;
 //BA.debugLineNum = 55;BA.debugLine="Public Sub getValues As List";
 //BA.debugLineNum = 56;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 57;BA.debugLine="res.Initialize";
_res.Initialize();
 //BA.debugLineNum = 58;BA.debugLine="For Each key As Object In list";
{
final anywheresoftware.b4a.BA.IterableList group3 = _vvvvvvvvvvvvvvv7;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = group3.Get(index3);
 //BA.debugLineNum = 59;BA.debugLine="res.Add(map.Get(key))";
_res.Add(_vvvvvvvvvvvvvvv6.Get(_key));
 }
};
 //BA.debugLineNum = 61;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 7;BA.debugLine="map.Initialize";
_vvvvvvvvvvvvvvv6.Initialize();
 //BA.debugLineNum = 8;BA.debugLine="list.Initialize";
_vvvvvvvvvvvvvvv7.Initialize();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvv3(Object _key,Object _value) throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Put (Key As Object, Value As Object)";
 //BA.debugLineNum = 13;BA.debugLine="If map.ContainsKey(Key) = False Then";
if (_vvvvvvvvvvvvvvv6.ContainsKey(_key)==__c.False) { 
 //BA.debugLineNum = 14;BA.debugLine="list.Add(Key)";
_vvvvvvvvvvvvvvv7.Add(_key);
 };
 //BA.debugLineNum = 16;BA.debugLine="map.Put(Key, Value)";
_vvvvvvvvvvvvvvv6.Put(_key,_value);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvv6(Object _key) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Public Sub Remove (Key As Object)";
 //BA.debugLineNum = 21;BA.debugLine="If map.ContainsKey(Key) = False Then Return";
if (_vvvvvvvvvvvvvvv6.ContainsKey(_key)==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 22;BA.debugLine="list.RemoveAt(list.IndexOf(Key))";
_vvvvvvvvvvvvvvv7.RemoveAt(_vvvvvvvvvvvvvvv7.IndexOf(_key));
 //BA.debugLineNum = 23;BA.debugLine="map.Remove(Key)";
_vvvvvvvvvvvvvvv6.Remove(_key);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvv4(Object _data) throws Exception{
Object[] _o = null;
 //BA.debugLineNum = 70;BA.debugLine="Public Sub SetDataFromSerializator (Data As Object";
 //BA.debugLineNum = 71;BA.debugLine="Dim o() As Object = Data";
_o = (Object[])(_data);
 //BA.debugLineNum = 72;BA.debugLine="map = o(0)";
_vvvvvvvvvvvvvvv6 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_o[(int) (0)]));
 //BA.debugLineNum = 73;BA.debugLine="list = o(1)";
_vvvvvvvvvvvvvvv7 = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_o[(int) (1)]));
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}

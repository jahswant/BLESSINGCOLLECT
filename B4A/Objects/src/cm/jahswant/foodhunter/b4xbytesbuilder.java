package cm.jahswant.foodhunter;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xbytesbuilder extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "cm.jahswant.foodhunter.b4xbytesbuilder");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", cm.jahswant.foodhunter.b4xbytesbuilder.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public byte[] _vvvvvvvvvvvv4 = null;
public int _vvvvvvvvvvvv5 = 0;
public b4a.example.dateutils _vvvvvv0 = null;
public cm.jahswant.foodhunter.main _vvvvvvv1 = null;
public cm.jahswant.foodhunter.utils _vvvvvvv2 = null;
public cm.jahswant.foodhunter.starter _vvvvvvv3 = null;
public cm.jahswant.foodhunter.b4xpages _vvvvvvv4 = null;
public cm.jahswant.foodhunter.b4xcollections _vvvvvvv5 = null;
public cm.jahswant.foodhunter.httputils2service _vvvvvvv6 = null;
public cm.jahswant.foodhunter.xuiviewsutils _vvvvvvv7 = null;
public cm.jahswant.foodhunter.b4xbytesbuilder  _vvvvvvvvvv5(byte[] _data) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Public Sub Append(Data() As Byte) As B4XBytesBuild";
 //BA.debugLineNum = 25;BA.debugLine="Return Append2(Data, 0, Data.Length)";
if (true) return _vvvvvvvvvv6(_data,(int) (0),_data.length);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public cm.jahswant.foodhunter.b4xbytesbuilder  _vvvvvvvvvv6(byte[] _data,int _startindex,int _length) throws Exception{
int _oldlength = 0;
 //BA.debugLineNum = 31;BA.debugLine="Public Sub Append2(Data() As Byte, StartIndex As I";
 //BA.debugLineNum = 32;BA.debugLine="Dim OldLength As Int = ChangeLength(mLength + Len";
_oldlength = _vvvvvvvvvv7((int) (_vvvvvvvvvvvv5+_length));
 //BA.debugLineNum = 33;BA.debugLine="Bit.ArrayCopy(Data, StartIndex, mBuffer, OldLengt";
__c.Bit.ArrayCopy((Object)(_data),_startindex,(Object)(_vvvvvvvvvvvv4),_oldlength,_length);
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (cm.jahswant.foodhunter.b4xbytesbuilder)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public int  _vvvvvvvvvv7(int _newlength) throws Exception{
int _oldlength = 0;
byte[] _b = null;
 //BA.debugLineNum = 12;BA.debugLine="Private Sub ChangeLength (NewLength As Int) As Int";
 //BA.debugLineNum = 13;BA.debugLine="Dim OldLength As Int = mLength";
_oldlength = _vvvvvvvvvvvv5;
 //BA.debugLineNum = 14;BA.debugLine="mLength = NewLength";
_vvvvvvvvvvvv5 = _newlength;
 //BA.debugLineNum = 15;BA.debugLine="If mBuffer.Length < mLength Then";
if (_vvvvvvvvvvvv4.length<_vvvvvvvvvvvv5) { 
 //BA.debugLineNum = 16;BA.debugLine="Dim b(Max(mBuffer.Length * 2, NewLength)) As Byt";
_b = new byte[(int) (__c.Max(_vvvvvvvvvvvv4.length*2,_newlength))];
;
 //BA.debugLineNum = 17;BA.debugLine="Bit.ArrayCopy(mBuffer, 0, b, 0, mBuffer.Length)";
__c.Bit.ArrayCopy((Object)(_vvvvvvvvvvvv4),(int) (0),(Object)(_b),(int) (0),_vvvvvvvvvvvv4.length);
 //BA.debugLineNum = 18;BA.debugLine="mBuffer = b";
_vvvvvvvvvvvv4 = _b;
 };
 //BA.debugLineNum = 20;BA.debugLine="Return OldLength";
if (true) return _oldlength;
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private mBuffer() As Byte";
_vvvvvvvvvvvv4 = new byte[(int) (0)];
;
 //BA.debugLineNum = 3;BA.debugLine="Private mLength As Int";
_vvvvvvvvvvvv5 = 0;
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvv6() throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Public Sub Clear";
 //BA.debugLineNum = 38;BA.debugLine="ChangeLength(0)";
_vvvvvvvvvv7((int) (0));
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public byte[]  _vvvvvvvvvv0() throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Private Sub getBuffer As Byte() 'ignore";
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public byte[]  _getvvvvvvvvvvvv2() throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Public Sub getInternalBuffer As Byte()";
 //BA.debugLineNum = 128;BA.debugLine="Return mBuffer";
if (true) return _vvvvvvvvvvvv4;
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public int  _getvvvvvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Public Sub getLength As Int";
 //BA.debugLineNum = 93;BA.debugLine="Return mLength";
if (true) return _vvvvvvvvvvvv5;
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return 0;
}
public int  _vvvvvvvvvvv3(byte[] _searchfor) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Public Sub IndexOf(SearchFor() As Byte) As Int";
 //BA.debugLineNum = 108;BA.debugLine="Return IndexOf2(SearchFor, 0)";
if (true) return _vvvvvvvvvvv4(_searchfor,(int) (0));
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return 0;
}
public int  _vvvvvvvvvvv4(byte[] _searchfor,int _index) throws Exception{
int _i1 = 0;
int _i2 = 0;
 //BA.debugLineNum = 112;BA.debugLine="Public Sub IndexOf2(SearchFor() As Byte, Index As";
 //BA.debugLineNum = 113;BA.debugLine="For i1 = Index To mLength - SearchFor.Length";
{
final int step1 = 1;
final int limit1 = (int) (_vvvvvvvvvvvv5-_searchfor.length);
_i1 = _index ;
for (;_i1 <= limit1 ;_i1 = _i1 + step1 ) {
 //BA.debugLineNum = 114;BA.debugLine="For i2 = 0 To SearchFor.Length - 1";
{
final int step2 = 1;
final int limit2 = (int) (_searchfor.length-1);
_i2 = (int) (0) ;
for (;_i2 <= limit2 ;_i2 = _i2 + step2 ) {
 //BA.debugLineNum = 115;BA.debugLine="If SearchFor(i2) <> mBuffer(i1 + i2) Then";
if (_searchfor[_i2]!=_vvvvvvvvvvvv4[(int) (_i1+_i2)]) { 
 //BA.debugLineNum = 116;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 119;BA.debugLine="If i2 = SearchFor.Length Then";
if (_i2==_searchfor.length) { 
 //BA.debugLineNum = 120;BA.debugLine="Return i1";
if (true) return _i1;
 };
 }
};
 //BA.debugLineNum = 123;BA.debugLine="Return -1";
if (true) return (int) (-1);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 7;BA.debugLine="Dim mBuffer(100) As Byte";
_vvvvvvvvvvvv4 = new byte[(int) (100)];
;
 //BA.debugLineNum = 8;BA.debugLine="mLength = 0";
_vvvvvvvvvvvv5 = (int) (0);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvv5(int _index,byte[] _data) throws Exception{
byte[] _afterindex = null;
 //BA.debugLineNum = 43;BA.debugLine="Public Sub Insert(Index As Int, Data() As Byte)";
 //BA.debugLineNum = 44;BA.debugLine="If Index >= mLength Then";
if (_index>=_vvvvvvvvvvvv5) { 
 //BA.debugLineNum = 45;BA.debugLine="If Index > mLength Then Log(\"Index too large\")";
if (_index>_vvvvvvvvvvvv5) { 
__c.LogImpl("94849666","Index too large",0);};
 //BA.debugLineNum = 46;BA.debugLine="Append(Data)";
_vvvvvvvvvv5(_data);
 }else {
 //BA.debugLineNum = 48;BA.debugLine="Dim AfterIndex() As Byte = SubArray(Index)";
_afterindex = _vvvvvvvvvvv7(_index);
 //BA.debugLineNum = 49;BA.debugLine="ChangeLength(mLength + Data.Length)";
_vvvvvvvvvv7((int) (_vvvvvvvvvvvv5+_data.length));
 //BA.debugLineNum = 50;BA.debugLine="Bit.ArrayCopy(Data, 0, mBuffer, Index, Data.Leng";
__c.Bit.ArrayCopy((Object)(_data),(int) (0),(Object)(_vvvvvvvvvvvv4),_index,_data.length);
 //BA.debugLineNum = 51;BA.debugLine="Bit.ArrayCopy(AfterIndex, 0, mBuffer, Index + Da";
__c.Bit.ArrayCopy((Object)(_afterindex),(int) (0),(Object)(_vvvvvvvvvvvv4),(int) (_index+_data.length),_afterindex.length);
 };
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public byte[]  _vvvvvvvvvvv6(int _beginindex,int _endindex) throws Exception{
byte[] _res = null;
byte[] _afterendindex = null;
 //BA.debugLineNum = 69;BA.debugLine="Public Sub Remove(BeginIndex As Int, EndIndex As I";
 //BA.debugLineNum = 70;BA.debugLine="Dim res() As Byte = SubArray2(BeginIndex, EndInde";
_res = _vvvvvvvvvvv0(_beginindex,_endindex);
 //BA.debugLineNum = 71;BA.debugLine="If EndIndex <= mLength Then";
if (_endindex<=_vvvvvvvvvvvv5) { 
 //BA.debugLineNum = 72;BA.debugLine="Dim AfterEndIndex() As Byte = SubArray(EndIndex)";
_afterendindex = _vvvvvvvvvvv7(_endindex);
 //BA.debugLineNum = 73;BA.debugLine="Bit.ArrayCopy(AfterEndIndex, 0, mBuffer, BeginIn";
__c.Bit.ArrayCopy((Object)(_afterendindex),(int) (0),(Object)(_vvvvvvvvvvvv4),_beginindex,_afterendindex.length);
 };
 //BA.debugLineNum = 75;BA.debugLine="ChangeLength(mLength - (EndIndex - BeginIndex))";
_vvvvvvvvvv7((int) (_vvvvvvvvvvvv5-(_endindex-_beginindex)));
 //BA.debugLineNum = 76;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public String  _vvvvvvvvvv1(int _index,byte[] _data) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Public Sub Set(Index As Int, Data() As Byte)";
 //BA.debugLineNum = 57;BA.debugLine="If Index >= mLength Then";
if (_index>=_vvvvvvvvvvvv5) { 
 //BA.debugLineNum = 58;BA.debugLine="If Index > mLength Then Log(\"Index too large\")";
if (_index>_vvvvvvvvvvvv5) { 
__c.LogImpl("94915202","Index too large",0);};
 //BA.debugLineNum = 59;BA.debugLine="Append(Data)";
_vvvvvvvvvv5(_data);
 }else {
 //BA.debugLineNum = 61;BA.debugLine="If Data.Length + Index > mLength Then";
if (_data.length+_index>_vvvvvvvvvvvv5) { 
 //BA.debugLineNum = 62;BA.debugLine="ChangeLength(Data.Length + Index)";
_vvvvvvvvvv7((int) (_data.length+_index));
 };
 //BA.debugLineNum = 64;BA.debugLine="Bit.ArrayCopy(Data, 0, mBuffer, Index, Data.Leng";
__c.Bit.ArrayCopy((Object)(_data),(int) (0),(Object)(_vvvvvvvvvvvv4),_index,_data.length);
 };
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public byte[]  _vvvvvvvvvvv7(int _beginindex) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Public Sub SubArray(BeginIndex As Int) As Byte()";
 //BA.debugLineNum = 81;BA.debugLine="Return SubArray2(BeginIndex, mLength)";
if (true) return _vvvvvvvvvvv0(_beginindex,_vvvvvvvvvvvv5);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public byte[]  _vvvvvvvvvvv0(int _beginindex,int _endindex) throws Exception{
byte[] _b = null;
 //BA.debugLineNum = 86;BA.debugLine="Public Sub SubArray2(BeginIndex As Int, EndIndex A";
 //BA.debugLineNum = 87;BA.debugLine="Dim b(EndIndex - BeginIndex) As Byte";
_b = new byte[(int) (_endindex-_beginindex)];
;
 //BA.debugLineNum = 88;BA.debugLine="Bit.ArrayCopy(mBuffer, BeginIndex, b, 0, b.Length";
__c.Bit.ArrayCopy((Object)(_vvvvvvvvvvvv4),_beginindex,(Object)(_b),(int) (0),_b.length);
 //BA.debugLineNum = 89;BA.debugLine="Return b";
if (true) return _b;
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public byte[]  _vvvvvvvvvvvv1() throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Public Sub ToArray() As Byte()";
 //BA.debugLineNum = 98;BA.debugLine="Return SubArray(0)";
if (true) return _vvvvvvvvvvv7((int) (0));
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}

package JAVA10;
//hw10_17,
class Car
{
protected String owner;
protected String id;

public Car(String own,String s)
{
   owner=own;
   id=s;
}
final void show()
{
   System.out.println("���D�m�W:"+owner);
   System.out.println("���P���X:"+id);
}
}

class CColor extends Car
{
public String color;

public CColor(String own,String s,String col)
{
   super(own,s);
   color=col;
}
public void show()
{
   System.out.println("���D�m�W:"+owner);
   System.out.println("���P���X:"+id);
   System.out.println("�����C��:"+color);
}
}

public class hw10_17
{
public static void main(String args[])
{
   CColor mycar=new CColor("Riaan","A1-2345","Black");
   mycar.show();
}
}

/* output�sĶ���T��-------------------------------------
error: show() in CColor cannot override show() in Car
public void show()
            ^
overridden method is final
------------------------------------------------------*/

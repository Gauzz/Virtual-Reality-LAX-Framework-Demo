import LAX.Lax;
public class Demo
{
public static void main(String[] args){
try{
Lax l=new Lax("new");
l.addTemplate("moonlight");
l.addText("Hello,World","#ffffff");
l.finish();
}
catch(Exception e){
System.out.println(e);
}
}
}
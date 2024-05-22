class abc{
void xyz()
{
System.out.println("FIRST FUNCTION");
}
void abcd(){
this.xyz( );
System.out.println("SECOND FUNCTION");
}
public static void main(String[]args){
abc m=new abc();
m.abcd();
}
}
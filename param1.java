import java.awt.*;
import java.applet.*;
[ublic class param1 extends Applet
{
String name,msg;
public void init()
{
name = getParameter("first_name");
}
msg = "Hi " + name;
g.drawSring(msg,30,30);
}
}
/*
<applet code="param1.class" width=300 height=300>
<param name ="first_name" value="Akila"/>
</applet>
*/
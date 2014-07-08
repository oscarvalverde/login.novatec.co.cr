package com.mycompany.client.resources;

import com.mycompany.client.resources.css.MyStylesCss;
import com.mycompany.client.resources.images.MyImages;
import com.google.gwt.resources.client.ClientBundle;

public interface MyBundle extends ClientBundle
{
    @Source("css/MyStylesCss.css")
    public MyStylesCss css();
    
    public MyImages images();
}

package etu1980.framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;


public class ModelView {
    String url;
    HashMap<String,Object> data;
    HashMap<String,Object> session;

    boolean isJson;

    public boolean isJson() {
        return isJson;
    }

    public void setJson(boolean json) {
        isJson = json;
    }

    public HashMap<String, Object> getData() {
        return data;
    }

    public void setData(HashMap<String, Object> data) {
        this.data = data;
    }

    public ModelView(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void AddItem(String key,Object valeur)
    {
        if(getData()==null)
        {
            setData(new HashMap<String,Object>());
        }
        this.getData().put(key,valeur);
    }
    public Object getItem(String item)
    {
        for (Map.Entry<String, Object> entry : this.getData().entrySet()) {
           if(entry.getKey().compareTo(item)==0)
           {
               return entry.getValue();
           }
        }
        return null;
    }

    public HashMap<String, Object> getSession() {
        return session;
    }

    public void AddSession(String key,Object valeur)
    {
        if(getSession()==null)
        {
            setSession(new HashMap<String,Object>());
        }
        this.getSession().put(key,valeur);
    }

    public void setSession(HashMap<String, Object> session) {
        this.session = session;
    }


}

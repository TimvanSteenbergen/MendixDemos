// This file was generated by Mendix Modeler 7.20.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package restdemo.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the RestDemo module
	public static java.lang.String order_Delete(IContext context, java.lang.Long _orderId)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("OrderId", _orderId);
			return (java.lang.String)Core.execute(context, "RestDemo.Order_Delete", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.util.List<restdemo.proxies.Order> order_Get_All(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			java.util.List<IMendixObject> objs = Core.execute(context, "RestDemo.Order_Get_All", params);
			java.util.List<restdemo.proxies.Order> result = null;
			if (objs != null)
			{
				result = new java.util.ArrayList<restdemo.proxies.Order>();
				for (IMendixObject obj : objs)
					result.add(restdemo.proxies.Order.initialize(context, obj));
			}
			return result;
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void order_Post(IContext context, system.proxies.HttpResponse _httpResponse, restdemo.proxies.Order _body)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("httpResponse", _httpResponse == null ? null : _httpResponse.getMendixObject());
			params.put("body", _body == null ? null : _body.getMendixObject());
			Core.execute(context, "RestDemo.Order_Post", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}
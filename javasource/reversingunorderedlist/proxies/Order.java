// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package reversingunorderedlist.proxies;

public class Order
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject orderMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ReversingUnorderedList.Order";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		CustomerID("CustomerID"),
		CustomerName("CustomerName"),
		Status("Status"),
		Attribute4("Attribute4"),
		Attribute5("Attribute5"),
		Attribute6("Attribute6"),
		Attribute7("Attribute7"),
		Attribute8("Attribute8"),
		Attribute9("Attribute9");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Order(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ReversingUnorderedList.Order"));
	}

	protected Order(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject orderMendixObject)
	{
		if (orderMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ReversingUnorderedList.Order", orderMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ReversingUnorderedList.Order");

		this.orderMendixObject = orderMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Order.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static reversingunorderedlist.proxies.Order initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return reversingunorderedlist.proxies.Order.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static reversingunorderedlist.proxies.Order initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new reversingunorderedlist.proxies.Order(context, mendixObject);
	}

	public static reversingunorderedlist.proxies.Order load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return reversingunorderedlist.proxies.Order.initialize(context, mendixObject);
	}

	public static java.util.List<reversingunorderedlist.proxies.Order> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<reversingunorderedlist.proxies.Order> result = new java.util.ArrayList<reversingunorderedlist.proxies.Order>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//ReversingUnorderedList.Order" + xpathConstraint))
			result.add(reversingunorderedlist.proxies.Order.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of CustomerID
	 */
	public final java.lang.Long getCustomerID()
	{
		return getCustomerID(getContext());
	}

	/**
	 * @param context
	 * @return value of CustomerID
	 */
	public final java.lang.Long getCustomerID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.CustomerID.toString());
	}

	/**
	 * Set value of CustomerID
	 * @param customerid
	 */
	public final void setCustomerID(java.lang.Long customerid)
	{
		setCustomerID(getContext(), customerid);
	}

	/**
	 * Set value of CustomerID
	 * @param context
	 * @param customerid
	 */
	public final void setCustomerID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long customerid)
	{
		getMendixObject().setValue(context, MemberNames.CustomerID.toString(), customerid);
	}

	/**
	 * @return value of CustomerName
	 */
	public final java.lang.String getCustomerName()
	{
		return getCustomerName(getContext());
	}

	/**
	 * @param context
	 * @return value of CustomerName
	 */
	public final java.lang.String getCustomerName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CustomerName.toString());
	}

	/**
	 * Set value of CustomerName
	 * @param customername
	 */
	public final void setCustomerName(java.lang.String customername)
	{
		setCustomerName(getContext(), customername);
	}

	/**
	 * Set value of CustomerName
	 * @param context
	 * @param customername
	 */
	public final void setCustomerName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String customername)
	{
		getMendixObject().setValue(context, MemberNames.CustomerName.toString(), customername);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final reversingunorderedlist.proxies.OrderStatusses getStatus()
	{
		return getStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of Status
	 */
	public final reversingunorderedlist.proxies.OrderStatusses getStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Status.toString());
		if (obj == null)
			return null;

		return reversingunorderedlist.proxies.OrderStatusses.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final void setStatus(reversingunorderedlist.proxies.OrderStatusses status)
	{
		setStatus(getContext(), status);
	}

	/**
	 * Set value of Status
	 * @param context
	 * @param status
	 */
	public final void setStatus(com.mendix.systemwideinterfaces.core.IContext context, reversingunorderedlist.proxies.OrderStatusses status)
	{
		if (status != null)
			getMendixObject().setValue(context, MemberNames.Status.toString(), status.toString());
		else
			getMendixObject().setValue(context, MemberNames.Status.toString(), null);
	}

	/**
	 * @return value of Attribute4
	 */
	public final java.lang.String getAttribute4()
	{
		return getAttribute4(getContext());
	}

	/**
	 * @param context
	 * @return value of Attribute4
	 */
	public final java.lang.String getAttribute4(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Attribute4.toString());
	}

	/**
	 * Set value of Attribute4
	 * @param attribute4
	 */
	public final void setAttribute4(java.lang.String attribute4)
	{
		setAttribute4(getContext(), attribute4);
	}

	/**
	 * Set value of Attribute4
	 * @param context
	 * @param attribute4
	 */
	public final void setAttribute4(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String attribute4)
	{
		getMendixObject().setValue(context, MemberNames.Attribute4.toString(), attribute4);
	}

	/**
	 * @return value of Attribute5
	 */
	public final java.lang.String getAttribute5()
	{
		return getAttribute5(getContext());
	}

	/**
	 * @param context
	 * @return value of Attribute5
	 */
	public final java.lang.String getAttribute5(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Attribute5.toString());
	}

	/**
	 * Set value of Attribute5
	 * @param attribute5
	 */
	public final void setAttribute5(java.lang.String attribute5)
	{
		setAttribute5(getContext(), attribute5);
	}

	/**
	 * Set value of Attribute5
	 * @param context
	 * @param attribute5
	 */
	public final void setAttribute5(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String attribute5)
	{
		getMendixObject().setValue(context, MemberNames.Attribute5.toString(), attribute5);
	}

	/**
	 * @return value of Attribute6
	 */
	public final java.lang.String getAttribute6()
	{
		return getAttribute6(getContext());
	}

	/**
	 * @param context
	 * @return value of Attribute6
	 */
	public final java.lang.String getAttribute6(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Attribute6.toString());
	}

	/**
	 * Set value of Attribute6
	 * @param attribute6
	 */
	public final void setAttribute6(java.lang.String attribute6)
	{
		setAttribute6(getContext(), attribute6);
	}

	/**
	 * Set value of Attribute6
	 * @param context
	 * @param attribute6
	 */
	public final void setAttribute6(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String attribute6)
	{
		getMendixObject().setValue(context, MemberNames.Attribute6.toString(), attribute6);
	}

	/**
	 * @return value of Attribute7
	 */
	public final java.lang.String getAttribute7()
	{
		return getAttribute7(getContext());
	}

	/**
	 * @param context
	 * @return value of Attribute7
	 */
	public final java.lang.String getAttribute7(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Attribute7.toString());
	}

	/**
	 * Set value of Attribute7
	 * @param attribute7
	 */
	public final void setAttribute7(java.lang.String attribute7)
	{
		setAttribute7(getContext(), attribute7);
	}

	/**
	 * Set value of Attribute7
	 * @param context
	 * @param attribute7
	 */
	public final void setAttribute7(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String attribute7)
	{
		getMendixObject().setValue(context, MemberNames.Attribute7.toString(), attribute7);
	}

	/**
	 * @return value of Attribute8
	 */
	public final java.lang.String getAttribute8()
	{
		return getAttribute8(getContext());
	}

	/**
	 * @param context
	 * @return value of Attribute8
	 */
	public final java.lang.String getAttribute8(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Attribute8.toString());
	}

	/**
	 * Set value of Attribute8
	 * @param attribute8
	 */
	public final void setAttribute8(java.lang.String attribute8)
	{
		setAttribute8(getContext(), attribute8);
	}

	/**
	 * Set value of Attribute8
	 * @param context
	 * @param attribute8
	 */
	public final void setAttribute8(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String attribute8)
	{
		getMendixObject().setValue(context, MemberNames.Attribute8.toString(), attribute8);
	}

	/**
	 * @return value of Attribute9
	 */
	public final java.lang.String getAttribute9()
	{
		return getAttribute9(getContext());
	}

	/**
	 * @param context
	 * @return value of Attribute9
	 */
	public final java.lang.String getAttribute9(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Attribute9.toString());
	}

	/**
	 * Set value of Attribute9
	 * @param attribute9
	 */
	public final void setAttribute9(java.lang.String attribute9)
	{
		setAttribute9(getContext(), attribute9);
	}

	/**
	 * Set value of Attribute9
	 * @param context
	 * @param attribute9
	 */
	public final void setAttribute9(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String attribute9)
	{
		getMendixObject().setValue(context, MemberNames.Attribute9.toString(), attribute9);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return orderMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final reversingunorderedlist.proxies.Order that = (reversingunorderedlist.proxies.Order) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "ReversingUnorderedList.Order";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}

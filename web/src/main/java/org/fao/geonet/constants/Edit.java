//=============================================================================
//===	Copyright (C) 2001-2007 Food and Agriculture Organization of the
//===	United Nations (FAO-UN), United Nations World Food Programme (WFP)
//===	and United Nations Environment Programme (UNEP)
//===
//===	This program is free software; you can redistribute it and/or modify
//===	it under the terms of the GNU General Public License as published by
//===	the Free Software Foundation; either version 2 of the License, or (at
//===	your option) any later version.
//===
//===	This program is distributed in the hope that it will be useful, but
//===	WITHOUT ANY WARRANTY; without even the implied warranty of
//===	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
//===	General Public License for more details.
//===
//===	You should have received a copy of the GNU General Public License
//===	along with this program; if not, write to the Free Software
//===	Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301, USA
//===
//===	Contact: Jeroen Ticheler - FAO - Viale delle Terme di Caracalla 2,
//===	Rome - Italy. email: geonetwork@osgeo.org
//==============================================================================

package org.fao.geonet.constants;

import org.jdom.Namespace;

//=============================================================================

/** Constants for editing attribs
  */

public class Edit
{
	//--------------------------------------------------------------------------
	//---
	//--- Namespace used for editing
	//---
	//--------------------------------------------------------------------------

	public static final String NS_PREFIX = "geonet";
	public static final String NS_URI    = "http://www.fao.org/geonetwork";

	public static final Namespace NAMESPACE = Namespace.getNamespace(NS_PREFIX, NS_URI);

	//--------------------------------------------------------------------------
	//---
	//--- Elements and attribs used to expand a metadata
	//---
	//--------------------------------------------------------------------------

	public class RootChild
	{
		public static final String INFO      = "info";
		public static final String ELEMENT   = "element";
		public static final String ATTRIBUTE = "attribute";
		public static final String CHILD     = "child";
		public static final String NULL      = "null";
		public static final String HELP      = "help";
		public static final String CODELISTS = "codelists";
		public static final String CHOICE    = "CHOICE_ELEMENT";
		public static final String SEQUENCE  = "SEQUENCE_ELEMENT";
		public static final String GROUP     = "GROUP_ELEMENT";
	}

	//--------------------------------------------------------------------------

	public class Info
	{
		public class Elem
		{
			public static final String ID          = "id";
			public static final String UUID        = "uuid";
			public static final String VERSION     = "version";
			public static final String SCHEMA      = "schema";
			public static final String CREATE_DATE = "createDate";
			public static final String CHANGE_DATE = "changeDate";
			public static final String SOURCE      = "source";
			public static final String SCORE       = "score";
			public static final String CATEGORY    = "category";
			public static final String SERVER      = "server";
			public static final String COLLECTION  = "collection";
			public static final String HTML        = "html";
			public static final String IS_TEMPLATE = "isTemplate";
			public static final String TITLE       = "title";
			public static final String IS_HARVESTED= "isHarvested";
			public static final String HARVEST_INFO= "harvestInfo";
			public static final String OWNERNAME   = "ownername";
			public static final String POPULARITY  = "popularity";
			public static final String RATING      = "rating";
			public static final String SELECTED    = "selected";
			public static final String SUBTEMPLATES = "subtemplates";
      public static final String DISPLAY_ORDER  = "displayOrder";
      public static final String BASEURL  = "baseUrl";
            public static final String IS_PUBLISHED_TO_ALL = "isPublishedToAll";

			//--- privileges

			public static final String ADMIN    	= "admin";
			public static final String EDIT     	= "edit";
			public static final String NOTIFY   	= "notify";
			public static final String DOWNLOAD 	= "download";
			public static final String DYNAMIC  	= "dynamic";
			public static final String FEATURED 	= "featured";
			public static final String VIEW     	= "view";
			public static final String GUEST_DOWNLOAD	= "guestdownload";
			public static final String OWNER    	= "owner";
		}
	}

	//--------------------------------------------------------------------------

	public class Element
	{
		public class Attr
		{
			public static final String REF  	= "ref";
			public static final String DEL  	= "del";
			public static final String UP   	= "up";
			public static final String DOWN 	= "down";
			public static final String ADD		= "add";
			public static final String PARENT = "parent";
			public static final String UUID   = "uuid";
			public static final String MIN  = "min";
			public static final String MAX  = "max";
		}

		public class Child
		{
			public static final String TEXT   = "text";
			public static final String CHOOSE = "choose";
		}
	}

	//--------------------------------------------------------------------------

	public class Attribute
	{
		public class Attr
		{
			public static final String NAME  = "name";
			public static final String ADD   = "add";
			public static final String DEL   = "del";
			public static final String VALUE = "value";
		}

		public class Child
		{
			public static final String TEXT    = "text";
			public static final String DEFAULT = "default";
		}
	}

	//--------------------------------------------------------------------------

	public class ChildElem
	{
		public class Attr
		{
			public static final String NAME      = "name";
			public static final String PREFIX    = "prefix";
			public static final String NAMESPACE = "namespace";
			public static final String PARENT    = "parent";
			public static final String UUID   	 = "uuid";
			public static final String ACTION    = "action";
			public static final String MIN       = "min";
			public static final String MAX       = "max";
		}

		public class Child
		{
			public static final String CHOOSE = "choose";
		}
	}

	//--------------------------------------------------------------------------

	public class Choose
	{
		public class Attr
		{
			public static final String NAME = "name";
		}
	}

	//--------------------------------------------------------------------------

	public class Value
	{
		public static final String TRUE  = "true";
		public static final String FALSE = "false";
	}
}

//=============================================================================


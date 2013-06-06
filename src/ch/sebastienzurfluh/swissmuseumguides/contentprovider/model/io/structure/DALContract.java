package ch.sebastienzurfluh.swissmuseumguides.contentprovider.model.io.structure;

import android.provider.BaseColumns;

/**
 * This is the structure of the database, table by table.
 * 
 * This contract is used by the local SQLite3 implementation, and by the remote MySQL
 * implementation.
 *
 *
 * @author Sebastien Zurfluh
 *
 */
public abstract class DALContract {
	public static abstract class AffiliationsContract implements BaseColumns {
		public static final String TABLE_NAME = "affiliations";
		/**
		 * This is the name of a row element according to cake... this should not be part of
		 * the contract but cake's queries are tricky.
		 */
		public static final String ROW_ELEMENT_NAME = "affiliations";
		public static final String COLUMN_NAME_ID = "id";
		public static final String COLUMN_NAME_PAGE_ID = "page_id";
		public static final String COLUMN_NAME_GROUP_ID = "group_id";
		public static final String COLUMN_NAME_ORDER = "order_id";
	}
	
	public static abstract class GroupsContract implements BaseColumns {
		public static final String TABLE_NAME = "groups";
		/**
		 * This is the name of a row element according to cake... this should not be part of
		 * the contract but cake's queries are tricky.
		 */
		public static final String ROW_ELEMENT_NAME = "Group";
		public static final String COLUMN_NAME_ID = "id";
		public static final String COLUMN_NAME_NAME = "name";
		public static final String COLUMN_NAME_MENU_ID = "menu_id";
	}
	
	public static abstract class MenusContract implements BaseColumns {
		public static final String TABLE_NAME = "menus";
		/**
		 * This is the name of a row element according to cake... this should not be part of
		 * the contract but cake's queries are tricky.
		 */
		public static final String ROW_ELEMENT_NAME = "Menu";
		public static final String COLUMN_NAME_ID = "id";
		public static final String COLUMN_NAME_TITLE = "title";
		public static final String COLUMN_NAME_DESCRIPTION = "description";
		public static final String COLUMN_NAME_THUMB_IMG_URL = "thumb_img_url";
		public static final String COLUMN_NAME_IMG_URL = "img_url";
	}
	
	public static abstract class PagesContract implements BaseColumns {
		/**
		 *  Cake CANNOT use the 'pages' name for a table. It is called 'page_elements' instead.
		 */
		public static final String TABLE_NAME = "page_elements";
		/**
		 * This is the name of a row element according to cake... this should not be part of
		 * the contract but cake's queries are tricky.
		 */
		public static final String ROW_ELEMENT_NAME = "PageElement";
		public static final String COLUMN_NAME_ID = "id";
		public static final String COLUMN_NAME_TITLE = "title";
		public static final String COLUMN_NAME_SUBTITLE = "subtitle";
		public static final String COLUMN_NAME_CONTENT = "content";
		public static final String COLUMN_NAME_MENU_ID = "menu_id";
	}

	public static abstract class ResourcesContract implements BaseColumns {
		public static final String TABLE_NAME = "resources";
		/**
		 * This is the name of a row element according to cake... this should not be part of
		 * the contract but cake's queries are tricky.
		 */
		public static final String ROW_ELEMENT_NAME = "Resource";
		public static final String COLUMN_NAME_ID = "id";
		public static final String COLUMN_NAME_TITLE = "title";
		public static final String COLUMN_NAME_URL = "url";
		public static final String COLUMN_NAME_DESCRIPTION = "description";
		public static final String COLUMN_NAME_TYPE = "type";
	}
}
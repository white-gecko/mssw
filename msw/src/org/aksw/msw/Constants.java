package org.aksw.msw;

import java.io.File;
import java.util.HashMap;

public final class Constants {

	public static final String FILES_PATH = "Android" + File.separator + "data"
			+ File.separator + "org.aksw.msw" + File.separator + "files";

	public static final String CERT_DIR = FILES_PATH + File.separator + "certs";
	public static final String WEB_MODELS_DIR = FILES_PATH + File.separator
			+ "models" + File.separator + "web";

	/**
	 * Directory for cached infered Models
	 */
	public static final String INF_MODELS_DIR = FILES_PATH + File.separator
			+ "models" + File.separator + "inf";
	public static final String LOCAL_MODELS_DIR = FILES_PATH + File.separator
			+ "models" + File.separator + "local";
	public static final String CACHE_MODELS_DIR = FILES_PATH + File.separator
			+ "models" + File.separator + "cache";

	public static final String PROP_hasData = "http://ns.aksw.org/Android/hasData";
	public static final String PROP_rdfType = "http://www.w3.org/1999/02/22-rdf-syntax-ns#type";

	public static final String DATA_KINDS_PREFIX = "http://ns.aksw.org/Android/ContactsContract.";
	public static final String COMMON_DATA_KINDS_PREFIX = DATA_KINDS_PREFIX
			+ "CommonDataKinds.";
	public static final String DATA_COLUMNS_PREFIX = DATA_KINDS_PREFIX
			+ "DataColumns.";

	/**
	 * Because the fields android.provider.ContactsContract.DataColumns is not
	 * available in API < 5
	 */

	public static final HashMap<String, String> DATA_COLUMNS = new HashMap<String, String>();

	static {
		DATA_COLUMNS.put("mimetype", PROP_rdfType);
		DATA_COLUMNS.put("data1", DATA_COLUMNS_PREFIX + "DATA1");
		DATA_COLUMNS.put("data2", DATA_COLUMNS_PREFIX + "DATA2");
		DATA_COLUMNS.put("data3", DATA_COLUMNS_PREFIX + "DATA3");
		DATA_COLUMNS.put("data4", DATA_COLUMNS_PREFIX + "DATA4");
		DATA_COLUMNS.put("data5", DATA_COLUMNS_PREFIX + "DATA5");
		DATA_COLUMNS.put("data6", DATA_COLUMNS_PREFIX + "DATA6");
		DATA_COLUMNS.put("data7", DATA_COLUMNS_PREFIX + "DATA7");
		DATA_COLUMNS.put("data8", DATA_COLUMNS_PREFIX + "DATA8");
		DATA_COLUMNS.put("data9", DATA_COLUMNS_PREFIX + "DATA9");
		DATA_COLUMNS.put("data10", DATA_COLUMNS_PREFIX + "DATA10");
		DATA_COLUMNS.put("data11", DATA_COLUMNS_PREFIX + "DATA11");
		DATA_COLUMNS.put("data12", DATA_COLUMNS_PREFIX + "DATA12");
		DATA_COLUMNS.put("data13", DATA_COLUMNS_PREFIX + "DATA13");
		DATA_COLUMNS.put("data14", DATA_COLUMNS_PREFIX + "DATA14");
		DATA_COLUMNS.put("data15", DATA_COLUMNS_PREFIX + "DATA15");
	}
	
	/**
	 * Because the fields android.provider.ContactsContract.DataColumns is not
	 * available in API < 5
	 */

	public static final HashMap<String, String> MIME_TYPES = new HashMap<String, String>();

	static {
		MIME_TYPES.put("vnd.android.cursor.item/email", DATA_KINDS_PREFIX + "Email.CONTENT_ITEM_TYPE");
		MIME_TYPES.put("vnd.android.cursor.item/email_v2", DATA_KINDS_PREFIX + "Email.CONTENT_ITEM_TYPE");
		MIME_TYPES.put("vnd.android.cursor.item/contact_event", DATA_KINDS_PREFIX + "Event.CONTENT_ITEM_TYPE");
		MIME_TYPES.put("vnd.android.cursor.item/group_membership", DATA_KINDS_PREFIX + "GroupMembership.CONTENT_ITEM_TYPE");
		MIME_TYPES.put("vnd.android.cursor.item/im", DATA_KINDS_PREFIX + "Im.CONTENT_ITEM_TYPE");
		MIME_TYPES.put("vnd.android.cursor.item/nickname", DATA_KINDS_PREFIX + "Nickname.CONTENT_ITEM_TYPE");
		MIME_TYPES.put("vnd.android.cursor.item/note", DATA_KINDS_PREFIX + "Note.CONTENT_ITEM_TYPE");
		MIME_TYPES.put("vnd.android.cursor.item/organization", DATA_KINDS_PREFIX + "Organization.CONTENT_ITEM_TYPE");
		MIME_TYPES.put("vnd.android.cursor.item/phone", DATA_KINDS_PREFIX + "Phone.CONTENT_ITEM_TYPE");
		MIME_TYPES.put("vnd.android.cursor.item/phone_v2", DATA_KINDS_PREFIX + "Phone.CONTENT_ITEM_TYPE");
		MIME_TYPES.put("vnd.android.cursor.item/photo", DATA_KINDS_PREFIX + "Photo.CONTENT_ITEM_TYPE");
		MIME_TYPES.put("vnd.android.cursor.item/relation", DATA_KINDS_PREFIX + "Relation.CONTENT_ITEM_TYPE");
		MIME_TYPES.put("vnd.android.cursor.item/name", DATA_KINDS_PREFIX + "StructuredName.CONTENT_ITEM_TYPE");
		MIME_TYPES.put("vnd.android.cursor.item/postal-address", DATA_KINDS_PREFIX + "StructuredPostal.CONTENT_ITEM_TYPE");
		MIME_TYPES.put("vnd.android.cursor.item/postal-address_v2", DATA_KINDS_PREFIX + "StructuredPostal.CONTENT_ITEM_TYPE");
		MIME_TYPES.put("vnd.android.cursor.item/website", DATA_KINDS_PREFIX + "Website.CONTENT_ITEM_TYPE");
	}
}

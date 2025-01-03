package org.fao.geonet.kernel.search;
/**
 *
 * Names of fields in the Lucene index.
 *
 * @author heikki doeleman
 *
 */
public class LuceneIndexField {

    /**
     * Groups allowed to view.
     */
	public static final String _OP0 = "_op0";
    /**
     * Groups allowed to download.
     */
    public static final String _OP1 = "_op1";
    /**
     * Groups allowed to edit.
     */
    public static final String _OP2 = "_op2";
    /**
     * Groups allowed to be notified.
     */
    public static final String _OP3 = "_op3";
    /**
     * Groups allowed "dynamic".
     */
    public static final String _OP5 = "_op5";
    /**
     * Groups allowed to feature.
     */
	public static final String _OP6 = "_op6";
	public static final String ABSTRACT = "abstract";
	public static final String ANY = "any";
	public static final String CAT = "_cat";
	public static final String CHANGE_DATE = "changeDate";
	public static final String DUMMY = "_dummy";
	public static final String EAST = "eastBL";
    /**
     * Not used in search.
     */
	public static final String GROUP_OWNER = "_groupOwner";
    public static final String INSPIRE_ANNEX = "inspireannex";
    public static final String INSPIRE_THEME = "inspiretheme";
	public static final String IS_TEMPLATE = "_isTemplate";
    public static final String INSPIRE_CAT = "inspirecat";
	public static final String KEYWORD = "keyword";
	public static final String METADATA_STANDARD_NAME = "metadataStandardName";
	public static final String NORTH = "northBL";
	public static final String OWNER = "_owner";
	public static final String PROTOCOL = "protocol";
	public static final String SOURCE = "_source";
	public static final String SOUTH = "southBL";
	public static final String TITLE = "title";
	public static final String TOPIC_CATEGORY = "topicCat";
	public static final String TYPE = "type";
	public static final String UUID = "_uuid";
    public static final String HARVESTUUID = "harvestUuid";
	public static final String WEST = "westBL";
    public static final String PARENTUUID = "parentUuid";
    public static final String OPERATESON = "operatesOn";
    public static final String SCHEMA =  "_schema";
    public static final String TEMPORALEXTENT_BEGIN = "tempExtentBegin";
    public static final String TEMPORALEXTENT_END = "tempExtentEnd";
    public static final String PUBLICATION_DATE = "publicationDate";
    public static final String CREATE_DATE = "createDate";
    public static final String REVISION_DATE = "revisionDate";
    public static final String DOWNLOAD = "download";
    public static final String DIGITAL = "digital";
    public static final String PAPER = "paper";
	public static final String SERVICE_TYPE = "serviceType";
}
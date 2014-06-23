package com.Gaia.dihai.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

	/**
	 * An array of sample (dummy) items.
	 */
	public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();
        public static String item_id_home = "home";

	/**
	 * A map of sample (dummy) items, by ID.
	 */
	public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();
        public static int HOME_KINDS = 0;
        public static int MYLIST_KINDS = 1;
        public static int FRIENDS_KINDS = 2;
        public static int DEVICES_KINDS = 3;
        public static int SETTING_KINDS = 4;
        public static int TOTAL_KINDS = SETTING_KINDS+1;
	static {
		// Add 5 sample items.
		addItem(new DummyItem("home", ""));
		addItem(new DummyItem("mylist", ""));
		addItem(new DummyItem("friends", ""));
		addItem(new DummyItem("devices", ""));
		addItem(new DummyItem("settngs", ""));
	}

	private static void addItem(DummyItem item) {
		ITEMS.add(item);
		ITEM_MAP.put(item.id, item);
	}

	/**
	 * A dummy item representing a piece of content.
	 */
	public static class DummyItem {
		public String id;
		public String content;

		public DummyItem(String id, String content) {
			this.id = id;
			this.content = content;
		}

		@Override
		public String toString() {
			return content;
		}
	}
}

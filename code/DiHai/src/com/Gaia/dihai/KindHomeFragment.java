package com.Gaia.dihai;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewConfiguration;
import android.widget.TextView;
import android.widget.SearchView;
import android.widget.SearchView.OnCloseListener;
import android.widget.SearchView.OnQueryTextListener;
import android.view.inputmethod.InputMethodManager;
import com.Gaia.dihai.dummy.DummyContent;

/**
 * A fragment representing a single Kind detail screen. This fragment is either
 * contained in a {@link KindListActivity} in two-pane mode (on tablets) or a
 * {@link KindDetailActivity} on handsets.
 */
public class KindHomeFragment extends Fragment {
	/**
	 * The fragment argument representing the item ID that this fragment
	 * represents.
	 */
	public static final String ARG_ITEM_ID = "item_id";

	/**
	 * The dummy content this fragment is presenting.
	 */
	private DummyContent.DummyItem mItem;

        /**
     * True when this Activity is in its search UI (with a {@link SearchView} and
     * .
     */
        private boolean mInSearchUi;
        private SearchView mSearchView;

	/**
	 * Mandatory empty constructor for the fragment manager to instantiate the
	 * fragment (e.g. upon screen orientation changes).
	 */
	public KindHomeFragment() {
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

               /*
		if (getArguments().containsKey(ARG_ITEM_ID)) {
			// Load the dummy content specified by the fragment
			// arguments. In a real-world scenario, use a Loader
			// to load content from a content provider.
			mItem = DummyContent.ITEM_MAP.get(getArguments().getString(
					ARG_ITEM_ID));
		}

                */
	}

    private void showInputMethod(View view) {
        InputMethodManager imm = (InputMethodManager)getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        if (imm != null) {
            if (!imm.showSoftInput(view, 0)) {

            }
        }
    }

    private void hideInputMethod(View view) {
        InputMethodManager imm = (InputMethodManager)getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        if (imm != null && view != null) {
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }



    
    /**
     * Listener used to send search queries to the phone search fragment.
     */
    private final OnQueryTextListener mSearchQueryTextListener =
            new OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    //do some thing lator!
                    /*
                    View view = getActivity().getCurrentFocus();
                    if (view != null) {
                        hideInputMethod(view);
                        view.clearFocus();
                    }*/
                    return true;
                }

                @Override
                public boolean onQueryTextChange(String newText) {
                    // Show search result with non-empty text. Show a bare list otherwise.
                    //do some thing lator!
                    return true;
                }
    };

    /**
     * Listener used to handle the "close" button on the right side of {@link SearchView}.
     * If some text is in the search view, this will clean it up. Otherwise this will exit
     * the search UI and let users go back to usual Phone UI.
     *
     * This does _not_ handle back button.
     */
    private final OnCloseListener mSearchCloseListener =
            new OnCloseListener() {
                @Override
                public boolean onClose() {
                    //do some thing lator!

                    return true;
                }
    };
    private void enterSearchUi() {
        //do some thing
        }

    private final OnClickListener mSearButtomClickListener = new OnClickListener() {
        @Override
        public void onClick(View view) {
                    //do some thing
                        hideInputMethod(mSearchView.findFocus());
            /*
            if (mInSearchUi) {
                if (mSearchView.hasFocus()) {
                    showInputMethod(mSearchView.findFocus());
                } else {
                    mSearchView.requestFocus();
                }
            } else {
                enterSearchUi();
            }
            */
        }
    };


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_kind_home_detail,
				container, false);
        
                mSearchView = (SearchView) rootView.findViewById(R.id.search_view);
                mSearchView.setOnQueryTextListener(mSearchQueryTextListener);
                mSearchView.setOnCloseListener(mSearchCloseListener);


        mSearchView.setIconifiedByDefault(true);
        mSearchView.setQueryHint(getString(R.string.hint_searh_bar_info));
        //mSearchView.setIconified(true);
        mSearchView.setOnQueryTextFocusChangeListener(new OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                /*
                if (hasFocus) {
                    showInputMethod(view.findFocus());
                }
                */
            }
        });


            final View filterOptionView = rootView.findViewById(R.id.search_buttom);
            filterOptionView.setOnClickListener(mSearButtomClickListener);
            //filterOptionView.requestFocus();

		// Show the dummy content as text in a TextView.
        /*
		if (mItem != null) {
			((TextView) rootView.findViewById(R.id.kind_detail))
					.setText(mItem.content);
		}
        */
		return rootView;
	}

        

    
}

package com.example.android.paristour;

class Listing {
    /**
     * If the listing has no image
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    private String mListingName;
    /**
     * Image resource ID for the listing
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Create a new listing object.
     *
     * @param listingName     is the listing name
     * @param imageResourceId is the image of the listing
     */
    public Listing(String listingName, int imageResourceId) {
        mListingName = listingName;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the Listing name.
     */
    public String getListingName() {
        return mListingName;
    }


    /**
     * Returns the image for the listing.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this listing.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}




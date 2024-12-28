package com.vladproduction.sharingappimproved;

import com.vladproduction.sharingappimproved.exceptions.EditException;

public interface EditStrategy {

    Photo edit(Photo photo) throws EditException;

}

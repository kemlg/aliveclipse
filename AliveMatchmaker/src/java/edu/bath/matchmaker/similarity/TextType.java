package edu.bath.matchmaker.similarity;

/**
 * Various kinds of text that can be extracted from a service.
 *
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public enum TextType {
    /**
     * The natural language description of the service's profile.
     */
    DESCRIPTION,

    /**
     * The URIs appearing in a service's process preconditions.
     */
    PRECONDITIONS,

    /**
     * The URIs appearing in a service's process postconditions (results).
     */
    POSTCONDITIONS;
}

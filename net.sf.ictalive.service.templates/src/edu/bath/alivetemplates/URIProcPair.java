package edu.bath.alivetemplates;

import java.net.URI;

import org.mindswap.owls.process.Process;

/**
 * Useful stuff for pairing these not so useful objects which gives you something useful.
 * @author adan
 *
 */
class URIProcPair {
	public final URI u;
	public final Process p;
	public URIProcPair(URI u, Process p) {
		this.u = u;
		this.p = p;
	}
}

/*
 * Created 10.02.2010
 *
 * (c) 2010 Thorsten Möller - University of Basel Switzerland
 *
 * This file is part of OSIRIS Next.
 *
 * OSIRIS Next is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * OSIRIS Next is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with OSIRIS Next.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.mindswap.exceptions;

import org.mindswap.owls.process.Process;

/**
 * Thrown if invocation of a service failed (because it is offline or crashed)
 * or if the service returned an error.
 *
 * @author unascribed
 * @version $Rev: 2414 $; $Author: thorsten $; $Date: 2010-02-12 17:49:56 +0100 (Fr, 12 Feb 2010) $
 */
public class ServiceFailureException extends HealableExecutionException
{
	private static final long serialVersionUID = -7154150820783370881L;

	/**
	 * @see ExecutionException#ExecutionException()
	 */
	public ServiceFailureException()
	{
		super();
	}

	/**
	 * @see ExecutionException#ExecutionException(String)
	 */
	public ServiceFailureException(final String message)
	{
		super(message);
	}

	/**
	 * @see ExecutionException#ExecutionException(String, Process)
	 */
	public ServiceFailureException(final String message, final Process process)
	{
		super(message, process);
	}

}

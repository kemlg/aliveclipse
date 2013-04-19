/*
 * Created 31.12.2008
 *
 * (c) 2008 Thorsten Möller - University of Basel Switzerland
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

import java.util.Set;

import org.mindswap.owls.process.Process;

/**
 * A special kind of execution exception used to indicate that the corresponding
 * composite process (in which this exception arise) can possibly recover from
 * this exception, thus, enabling resumption of execution. <em>Healing</em> this
 * exception requires replacing the failed atomic process, i.e., a grounded
 * atomic service whose invocation failed, (and possibly remaining parts of the
 * composite process as well) by a replacement process that yields a functional
 * semantically equivalent execution.
 *
 * @author unascribed
 * @version $Rev:$; $Author:$; $Date:$
 */
public class HealableExecutionException extends ExecutionException
{
	private static final long serialVersionUID = -6206464410262350108L;

	/**
	 * @see ExecutionException#ExecutionException()
	 */
	public HealableExecutionException()
	{
		super();
	}

	/**
	 * @see ExecutionException#ExecutionException(String)
	 */
	public HealableExecutionException(final String message)
	{
		super(message);
	}

	/**
	 * @see ExecutionException#ExecutionException(String, Process)
	 */
	public HealableExecutionException(final String message, final Process process)
	{
		super(message, process);
	}

	/**
	 * @see ExecutionException#ExecutionException(Throwable)
	 */
	public HealableExecutionException(final Throwable t)
	{
		super(t);
	}

	/**
	 * @see ExecutionException#ExecutionException(Throwable, Process)
	 */
	public HealableExecutionException(final Throwable cause, final Process process)
	{
		super(cause, process);
	}

	/**
	 * @see ExecutionException#ExecutionException(Set)
	 */
	public HealableExecutionException(final Set<Exception> causes)
	{
		super(causes);
	}

}

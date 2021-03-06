/*
 * The MIT License
 *
 * Copyright (c) 2013, benas (md.benhassine@gmail.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package io.github.todolist.core.service.api;

import io.github.todolist.core.domain.Priority;
import io.github.todolist.core.domain.Status;
import io.github.todolist.core.domain.Todo;

import java.util.List;

/**
 * Business interface for todo manager.
 * @author benas (md.benhassine@gmail.com)
 */
public interface TodoService {

    /**
     * Get todo by identifier.
     * @param id the todo identifier
     * @return the todo with identifier id
     */
    Todo getTodoById(final long id);

    /**
     * Get todo list for the given user.
     * @param userId the user identifier
     * @return the todo list for the given user
     */
    List<Todo> getTodoListByUser(final long userId);

    /**
     * Get todo list by status for the given user.
     * @param userId the user identifier
     * @param status the todo {@link Status}
     * @return the todo list for the given user
     */
    List<Todo> getTodoListByStatus(final long userId, final Status status);

    /**
     * Get todo list by priority for the given user.
     * @param userId the user identifier
     * @param priority the todo {@link Priority}
     * @return the todo list for the given user
     */
    List<Todo> getTodoListByPriority(final long userId, final Priority priority);

    /**
     * Get todo list by status and priority for the given user.
     * @param userId the user identifier
     * @param status the todo {@link Status}
     * @param priority the todo {@link Priority}
     * @return the todo list for the given user
     */
    List<Todo> getTodoListByStatusAndPriority(final long userId, final Status status, final Priority priority);

    /**
     * Search todo list by title for the given user.
     * @param title the todo title
     * @param userId the user identifier
     * @return the todo list containing the 'title' parameter in their title for the given user
     */
    List<Todo> searchTodoListByTitleByUserId(final String title, final long userId);

    /**
     * Update a todo.
     * @param todo the todo to update
     * @return the updated todo
     */
    Todo update(Todo todo);

    /**
     * Create a new todo.
     * @param todo the todo to create
     * @return the created todo
     */
    Todo create(final Todo todo);

    /**
     * Remove a todo.
     * @param todo the todo to remove
     */
    void remove(final Todo todo);

}

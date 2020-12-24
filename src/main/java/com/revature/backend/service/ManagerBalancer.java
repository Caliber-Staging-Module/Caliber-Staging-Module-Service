/**
 * This interface describes the method(s) necessary to assign new batches of associates to
 * staging managers, and to ensure that this assignment is done as evenly as possible.
 * 
 * @author Andrew Curry
 */
package com.revature.backend.service;

import java.util.List;

import com.revature.backend.model.Associate;
import com.revature.backend.model.Batch;
import com.revature.backend.model.Manager;

public interface ManagerBalancer {
    
    /**
     * This method takes the given batches/associates and assigns them to staging
     * managers. It uses the following criteria:
     *  - associates from a given batch should all be assigned to the same manager
     *  - each manager should end up with a (rougly) equivalent amount of associates.
     * 
     * There is no return value; the Associate objects will be updated directly with their
     * assignments.
     * 
     * @param stagingManagers : should be a list of all staging managers in the system.
     * @param newBatches : should be a list of new, unassigned batches
     * @param newAssociates : should be a list of new, unassigned associates. Each
     * of these associates should be in one of the given batches.
     */
    public void balanceNewBatches(
        List<Manager> stagingManagers, 
        List<Batch> newBatches,
        List<Associate> newAssociates);
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package moe.yuna.palinuridae.core;

import org.springframework.jdbc.core.ResultSetExtractor;

/**
 *
 * @author rika
 */
@FunctionalInterface
public interface DBCallable<T> extends ResultSetExtractor<T>{
}

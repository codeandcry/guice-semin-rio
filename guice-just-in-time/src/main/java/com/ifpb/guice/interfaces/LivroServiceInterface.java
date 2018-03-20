package com.ifpb.guice.interfaces;

import com.google.inject.ImplementedBy;
import com.ifpb.guice.service.LivroService;

/**
 *
 * @author jozimar
 */
@ImplementedBy(LivroService.class)
public interface LivroServiceInterface {

    LivroDaoInterface getDao();
}

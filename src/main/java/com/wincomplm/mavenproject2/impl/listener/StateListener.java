/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wincomplm.mavenproject2.impl.listener;

import com.wincomplm.wex.kernel.impl.annotations.WexComponent;
import com.wincomplm.wex.kernel.impl.annotations.WexWtEventKey;
import com.wincomplm.wex.kernel.impl.annotations.WexWtListener;
import com.wincomplm.wex.kernel.impl.wki.IWexWtListener;
import wt.change2.WTChangeOrder2;
import wt.doc.WTDocument;
import wt.epm.EPMDocument;
import wt.events.KeyedEvent;
import wt.facade.persistedcollection.ManagedCollection;
import wt.lifecycle.LifeCycleServiceEvent;
import wt.maturity.PromotionNotice;
import wt.part.WTPart;
import wt.vc.baseline.ManagedBaseline;

/**
 *
 * @author YangHaoZhang
 */
@WexComponent(uid = "wex-listener", description = "")
@WexWtListener({
    @WexWtEventKey(eventClass = LifeCycleServiceEvent.class, keys = LifeCycleServiceEvent.SET_STATE, supported
            = {WTChangeOrder2.class, PromotionNotice.class, ManagedBaseline.class, ManagedCollection.class, WTDocument.class, EPMDocument.class, WTPart.class})})
public class StateListener implements IWexWtListener<Object> {

    @Override
    public void onEvent(KeyedEvent ke, String string, Object t) throws Exception {
        System.out.println("Setting state for " + t.getClass());
    }

}

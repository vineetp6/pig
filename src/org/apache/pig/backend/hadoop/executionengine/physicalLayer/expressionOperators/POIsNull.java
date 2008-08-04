/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.pig.backend.hadoop.executionengine.physicalLayer.expressionOperators;

import java.util.Map;

import org.apache.pig.backend.executionengine.ExecException;
import org.apache.pig.backend.hadoop.executionengine.physicalLayer.POStatus;
import org.apache.pig.backend.hadoop.executionengine.physicalLayer.Result;
import org.apache.pig.backend.hadoop.executionengine.physicalLayer.plans.PhyPlanVisitor;
import org.apache.pig.data.DataBag;
import org.apache.pig.data.DataByteArray;
import org.apache.pig.data.DataType;
import org.apache.pig.data.Tuple;
import org.apache.pig.impl.plan.OperatorKey;
import org.apache.pig.impl.plan.NodeIdGenerator;
import org.apache.pig.impl.plan.VisitorException;

public class POIsNull extends UnaryComparisonOperator {

    public POIsNull(OperatorKey k, int rp) {
        super(k, rp);
        
    }

    public POIsNull(OperatorKey k) {
        super(k);
        
    }
    
    public POIsNull(OperatorKey k, int rp, ExpressionOperator in) {
        super(k, rp);
        this.expr = in;
    }

    @Override
    public void visit(PhyPlanVisitor v) throws VisitorException {
        v.visitIsNull(this);
    }

    @Override
    public String name() {
        // TODO Auto-generated method stub
        return "POIsNull" + "[" + DataType.findTypeName(resultType) + "]" +" - " + mKey.toString();
    }

    @Override
    public Result getNext(Double d) throws ExecException {
        Result res = expr.getNext(d);
        if(res.returnStatus == POStatus.STATUS_OK) {
            if ((Double)res.result == null) {
                res.result = true;
            } else {
                res.result = false;
            }
        }
        return res;
    }

    @Override
    public Result getNext(Float f) throws ExecException {
        Result res = expr.getNext(f);
        if(res.returnStatus == POStatus.STATUS_OK) {
            if ((Float)res.result == null) {
                res.result = true;
            } else {
                res.result = false;
            }
        }
        return res;
    }

    @Override
    public Result getNext(Integer i) throws ExecException {
        Result res = expr.getNext(i);
        if(res.returnStatus == POStatus.STATUS_OK) {
            if ((Integer)res.result == null) {
                res.result = true;
            } else {
                res.result = false;
            }
        }
        return res;
    }

    @Override
    public Result getNext(Long l) throws ExecException {
        Result res = expr.getNext(l);
        if(res.returnStatus == POStatus.STATUS_OK) {
            if ((Long)res.result == null) {
                res.result = true;
            } else {
                res.result = false;
            }
        }
        return res;
    }
    
    @Override
    public Result getNext(DataByteArray dba) throws ExecException {
        Result res = expr.getNext(dba);
        if(res.returnStatus == POStatus.STATUS_OK) {
            if ((DataByteArray)res.result == null) {
                res.result = true;
            } else {
                res.result = false;
            }
        }
        return res;
    }
    
    @Override
    public Result getNext(String s) throws ExecException {
        Result res = expr.getNext(s);
        if(res.returnStatus == POStatus.STATUS_OK) {
            if ((String)res.result == null) {
                res.result = true;
            } else {
                res.result = false;
            }
        }
        return res;
    }
    
    @Override
    public Result getNext(Boolean b) throws ExecException {
        Result res = expr.getNext(b);
        if(res.returnStatus == POStatus.STATUS_OK) {
            if ((Boolean)res.result == null) {
                res.result = true;
            } else {
                res.result = false;
            }
        }
        return res;
    }
    
    @Override
    public Result getNext(Tuple t) throws ExecException {
        Result res = expr.getNext(t);
        if(res.returnStatus == POStatus.STATUS_OK) {
            if ((Tuple)res.result == null) {
                res.result = true;
            } else {
                res.result = false;
            }
        }
        return res;
    }
    
    @Override
    public Result getNext(DataBag b) throws ExecException {
        Result res = expr.getNext(b);
        if(res.returnStatus == POStatus.STATUS_OK) {
            if ((DataBag)res.result == null) {
                res.result = true;
            } else {
                res.result = false;
            }
        }
        return res;
    }
    
    @Override
    public Result getNext(Map m) throws ExecException {
        Result res = expr.getNext(m);
        if(res.returnStatus == POStatus.STATUS_OK) {
            if ((Map)res.result == null) {
                res.result = true;
            } else {
                res.result = false;
            }
        }
        return res;
    }

    @Override
    public POIsNull clone() throws CloneNotSupportedException {
        POIsNull clone = new POIsNull(new OperatorKey(mKey.scope, 
            NodeIdGenerator.getGenerator().getNextNodeId(mKey.scope)));
        clone.cloneHelper(this);
        return clone;
    }
}

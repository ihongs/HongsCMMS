package foo.hongs.dh.graphs;

import foo.hongs.HongsException;
import foo.hongs.action.ActionHelper;
import foo.hongs.action.ActionRunner;
import foo.hongs.action.anno.Action;
import foo.hongs.dh.IActing;
import foo.hongs.dh.IAction;
import foo.hongs.dh.IEntity;
import foo.hongs.dh.ModelGate;

/**
 * 图操作接口
 * @author Hongs
 */
@Action()
public class GraphsAction extends ModelGate implements IActing, IAction {

    /**
     * 获取模型对象
     * 注意:
     *  对象 Action 注解的命名必须为 "模型路径/实体名称"
     *  方法 Action 注解的命名只能是 "动作名称", 不得含子级实体名称
     * @param helper
     * @return
     * @throws HongsException
     */
    @Override
    public IEntity getEntity(ActionHelper helper)
    throws HongsException {
        ActionRunner runner = (ActionRunner)
           helper.getAttribute(ActionRunner.class.getName());
        return GraphsRecord.getInstance (runner.getModule(), runner.getEntity());
    }

}
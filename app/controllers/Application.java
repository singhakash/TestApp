package controllers;

import models.Member;
import play.*;
import play.data.Form;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import play.mvc.*;

import views.html.*;

import java.util.List;

public class Application extends Controller {

    @Transactional
    public static Result index() {

        List<Member> membersList = JPA.em().createQuery("select e from Member e").getResultList();

        return ok(index.render("Your new application is ready.",membersList));
    }

    @Transactional
    public static Result create() {

        Form<Member> form = Form.form(Member.class).bindFromRequest();

        JPA.em().persist(form.get());

        return redirect(routes.Application.index());


    }
    @Transactional
    public static Result delete(Long id) {

        List<Member> membersList = JPA.em().createQuery("select e from Member e where e.id=:id")
                 .setParameter("id",id)
                 .getResultList();


        JPA.em().remove(membersList.get(0));

        return redirect(routes.Application.index());


    }

}

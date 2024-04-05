package com.redis.redis;

import com.redis.om.spring.metamodel.MetamodelField;
import com.redis.om.spring.metamodel.SearchFieldAccessor;
import com.redis.om.spring.metamodel.indexed.TextTagField;
import com.redis.om.spring.metamodel.nonindexed.NonIndexedTagField;
import com.redis.om.spring.metamodel.nonindexed.NonIndexedTextField;
import java.lang.NoSuchFieldException;
import java.lang.SecurityException;
import java.lang.String;
import java.lang.reflect.Field;
import java.util.List;

public final class Pizza$ {
  public static Field id;

  public static Field user;

  public static Field purchaseList;

  public static TextTagField<Pizza, String> ID;

  public static NonIndexedTextField<Pizza, String> USER;

  public static NonIndexedTagField<Pizza, List<Pizza.PurchaseList>> PURCHASE_LIST;

  public static MetamodelField<Pizza, String> _KEY;

  static {
    try {
      id = com.redis.om.spring.util.ObjectUtils.getDeclaredFieldTransitively(Pizza.class, "id");
      user = com.redis.om.spring.util.ObjectUtils.getDeclaredFieldTransitively(Pizza.class, "user");
      purchaseList = com.redis.om.spring.util.ObjectUtils.getDeclaredFieldTransitively(Pizza.class, "purchaseList");
      ID = new TextTagField<Pizza, String>(new SearchFieldAccessor("id", id),true);
      USER = new NonIndexedTextField<Pizza, String>(new SearchFieldAccessor("user", user),false);
      PURCHASE_LIST = new NonIndexedTagField<Pizza, List<Pizza.PurchaseList>>(new SearchFieldAccessor("purchaseList", purchaseList),false);
      _KEY = new MetamodelField<Pizza, String>("__key", String.class, true);
    } catch(NoSuchFieldException | SecurityException e) {
      System.err.println(e.getMessage());
    }
  }
}

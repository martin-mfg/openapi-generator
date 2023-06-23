<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class Dummy200ResponseOuterProp
{
    /**
     * @DTA\Data(field="innerProp", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Dummy200ResponseOuterPropInnerProp::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Dummy200ResponseOuterPropInnerProp::class})
     * @var \App\DTO\Dummy200ResponseOuterPropInnerProp|null
     */
    public $inner_prop;

}
